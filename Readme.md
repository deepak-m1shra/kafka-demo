# Getting Started Guide with Kafka

### Start Zookeeper
> bin/zookeeper-server-start.sh config/zookeeper.properties

### Start Kafka Server
> bin/kafka-server-start.sh config/server.properties

### Create a topic
> bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092

### Start the producer 
> bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092

### Start the consumer
> bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
