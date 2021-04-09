# spring-cloud-stream-sleuth
Sample Repo for using Spring Cloud Stream with Spring Cloud Sleuth. 
Contains two Spring Boot projects which each have a simple Spring Boot microservice. 
Run them using `mvn spring-boot:run`

Start the Solace PubSub+ Event Broker & the OpenZipkin container before running apps & sending messages
Solace Docker Container: `docker run -d -p 8080:8080 -p 55555:55555 -p:8008:8008 -p:1883:1883 -p:8000:8000 -p:5672:5672 -p:9000:9000 -p:2222:2222 --shm-size=2g --env username_admin_globalaccesslevel=admin --env username_admin_password=admin --name=solace solace/solace-pubsub-standard`

OpenZipkin Docker Container: `docker run -d -p 9411:9411 openzipkin/zipkin`

Send messages to the `uppercase-in-0` topic using the Solace Try-Me tab in the PubSub+ Manager at localhost:8080 (login: admin/admin). 
Listen to outgoing messages on the `reverse-out-0` topic. 

See Span information in OpenZipkin at localhost:9411

**Expected Flow**: 
Try-Me Publisher -> uppercase-in-0 topic -> Uppercase Microservice (Trace starts here) -> uppercase-out-0 topic -> Reverse Microservice (Tracing still enabled here...same traceid, different span id) -> reverse-out-0 topic -> Try Me Consumer if you want
