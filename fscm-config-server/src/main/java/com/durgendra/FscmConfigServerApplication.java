package com.durgendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FscmConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FscmConfigServerApplication.class, args);
	}

}
