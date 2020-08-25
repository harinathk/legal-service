package com.cognizant.legal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LawyerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LawyerserviceApplication.class, args);
	}

}
