package com.student.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudentApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentApp1Application.class, args);
	}

	@Bean
	public RestTemplate restBean() {
		return new RestTemplate();
	}
}
