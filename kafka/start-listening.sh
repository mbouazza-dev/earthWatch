#!/bin/sh
apache-zookeeper-3.7.0-bin/bin/zkServer.sh start
kafka_2.13-3.1.0/bin/kafka-server-start.sh kafka_2.13-3.1.0/config/server.properties &
kafka_2.13-3.1.0/bin/kafka-topics.sh --create --topic general-events --bootstrap-server localhost:9092
kafka_2.13-3.1.0/bin/kafka-console-consumer.sh --topic general-events --from-beginning --bootstrap-server localhost:9092
