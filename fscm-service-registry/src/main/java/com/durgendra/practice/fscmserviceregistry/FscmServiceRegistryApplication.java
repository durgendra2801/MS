package com.durgendra.practice.fscmserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FscmServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FscmServiceRegistryApplication.class, args);
	}

}
