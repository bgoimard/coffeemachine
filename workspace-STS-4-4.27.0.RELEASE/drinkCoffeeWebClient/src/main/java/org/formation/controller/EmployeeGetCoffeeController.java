package org.formation.controller;

import org.formation.dto.CoffeeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@RestController
public class EmployeeGetCoffeeController {
	
	private WebClient webClient;

	@GetMapping("drink/{id}")
	public CoffeeDto getById(@PathVariable Long id){
		CoffeeDto coffee = webClient
			.get()
			.uri("http://localhost:8080/coffees/"+id)
			.retrieve()
			.bodyToMono(CoffeeDto.class)
			.block();
		
		log.info("=>"+coffee);
		return coffee;
	}
}
