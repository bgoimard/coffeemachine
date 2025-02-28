package org.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CoffeeconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeconfigserverApplication.class, args);
	}

}
