# spring-cloud-stream-sleuth
Sample Project for using Spring Cloud Stream with Spring Cloud Sleuth. 

Start the Solace PubSub+ Event Broker & the OpenZipkin container before running app & sending messages
Solace: `docker run -d -p 8080:8080 -p 55555:55555 -p:8008:8008 -p:1883:1883 -p:8000:8000 -p:5672:5672 -p:9000:9000 -p:2222:2222 --shm-size=2g --env username_admin_globalaccesslevel=admin --env username_admin_password=admin --name=solace solace/solace-pubsub-standard`

OpenZipkin: `docker run -d -p 9411:9411 openzipkin/zipkin`
