package com.durgendra.fscm.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FscmGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FscmGatewayApplication.class, args);
	}

}
