package com.cognizant.legaldiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LegalDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegalDiscoveryServiceApplication.class, args);
	}

}
