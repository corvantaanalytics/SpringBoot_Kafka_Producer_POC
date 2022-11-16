package com.corvanta.kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.corvanta.kafka.model.User;


@Configuration
public class SpringKafkaConfig {

	@Value("${kafkaServer.boot}")
	private String kafkaServer;

	@Bean
    public ProducerFactory producerFactory(){
        Map<String,Object> config = new HashMap<String,Object>();

        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,kafkaServer);
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, org.springframework.kafka.support.serializer.JsonSerializer.class);

        return new DefaultKafkaProducerFactory<String, Object>(config);
    }

    @Bean
    public KafkaTemplate<String, User> kafkaTemplate(){
        return new KafkaTemplate<String, User>(producerFactory());
    }
}