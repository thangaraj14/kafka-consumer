# kafka-consumer


## Technologies Used

- Java
- Spring Boot
- Docker
- Kubernetes
- Kafka

## Requirements
Java 11


### Run Multiple Instances
Open different terminals
Go to /kafka-consumer                                                                                                                        
❯ ./gradlew clean build

cd build/libs
cmd : 
1. java -jar -Dserver.port=7018 -Dspring.profiles.active=production kafka-consumer-0.0.1.jar
2. java -jar -Dserver.port=7019 -Dspring.profiles.active=production kafka-consumer-0.0.1.jar


## Running it as a docker image
/kafka-consumer
❯ docker build -t kafka-load:tag .

check : docker images

## Running it using Kubernetes

❯ minikube start hyperkit
❯ kubectl apply -f kafka-consumer-deployment.yaml

## To track Kafka consumer group-id

/usr/local/Cellar/kafka/3.4.0/libexec/bin                                                                                       
❯ ./kafka-consumer-groups.sh --bootstrap-server localhost:9088 --describe --group kafka-rr-group-id

