package org.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class CoffeeMachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeMachineApplication.class, args);
	}

}
