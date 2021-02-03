package com.weather;

import org.neo4j.springframework.data.repository.config.EnableNeo4jRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableNeo4jRepositories
@SpringBootApplication
public class WeatherapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherapiApplication.class, args);
	}

	@Bean
public RestTemplate restTemplate(){
		return new RestTemplate();
}
}
