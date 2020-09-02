package com.cognizant.legal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.SQLException;
import org.h2.tools.Server;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages="com.cognizant.legal.repo")
public class ConsumerserviceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerserviceApplication.class, args);
	}

	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
		return Server.createTcpServer(
				"-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
	}


	@Override
	public void run(String... args) throws Exception {
		
		
	}
	
}
