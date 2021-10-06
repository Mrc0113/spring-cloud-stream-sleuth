package com.solace.samples.spring.scs;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

@SpringBootApplication
public class SpringCloudStreamSleuthApplication {
	
    private static final Logger log = LoggerFactory.getLogger(SpringCloudStreamSleuthApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamSleuthApplication.class, args);
	}
	
	@Bean
	public Function<Message<String>, String> reverse(){
		return v -> {
			log.info("Received: " + v);
			StringBuilder sb = new StringBuilder();
			return sb.append(v.getPayload()).reverse().toString();
		};
	}
	
}
