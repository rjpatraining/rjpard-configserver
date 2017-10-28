package com.rjpard.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverrdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverrdApplication.class, args);
	}
}
