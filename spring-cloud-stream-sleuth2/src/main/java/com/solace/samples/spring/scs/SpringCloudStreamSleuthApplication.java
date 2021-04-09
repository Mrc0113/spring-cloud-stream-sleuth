package com.solace.samples.spring.scs;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudStreamSleuthApplication {
	
    private static final Logger log = LoggerFactory.getLogger(SpringCloudStreamSleuthApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamSleuthApplication.class, args);
	}
	
	@Bean
	public Function<String, String> reverse(){
		return v -> {
			log.info("Received: " + v);
			StringBuilder sb = new StringBuilder();
			return sb.append(v).reverse().toString();
		};
	}
	
}
