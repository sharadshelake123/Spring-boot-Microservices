package com.student.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StudentAppClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppClientApplication.class, args);
	}

}
