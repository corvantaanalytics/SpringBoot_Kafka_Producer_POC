KAFKA INSTALLATION STEPS:
-------------------------

1)Install Apache Kafka from https://kafka.apache.org/downloads.Choose version of your choice.
2)Extract and store it in a separate folder.
3)Create a new folder named DATA in the extracted folder. Add 2 more folders inside DATA folder naming them Zookeeper and Kafka.
4)Set Environment Variables for Kafka. Make sure you have JAVA jdk version 8. Also make sure you have environment variables set for JAVA.
5)Copy the path of previously created Zookeeper folder. Go to Config folder and right click on zookeeper properties.Click edit with Notepad++(or the editor of your choice).
6)In the zookeeper properties file search for (Datadir=) and paste the copied path of your zookeeper folder in Datadir.Save
7)Copy the path of previously created Kafka folder. Go to Config folder and right click on server properties.Click edit with Notepad++(or the editor of your choice).
8)6)In the server properties file search for (log.dirs=) and paste the copied path of your kafka folder in log.dirs.Save
8)Now open the command prompt and check for java version.
9).\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties   ---->>>Command to start Zookeeper
10).\bin\windows\kafka-server-start.bat .\config\server.properties         ---->>>Command to start Kafka
11)Do steps 9 and 10 in separate command prompts and kep them open.
12) INFO binding to port 0.0.0.0/0.0.0.0:2181   ---->>>Check for this in the response after step 9 is over. This confirms that your zookeeper is ready.
13) Startup complete.     ---->>>Check for this in the response after step 10 is over. This confirms that your kafka is ready.
14)Now kafka is running and ready to stream data.

