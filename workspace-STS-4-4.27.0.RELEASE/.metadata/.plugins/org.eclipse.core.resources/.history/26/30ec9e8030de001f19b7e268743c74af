package org.formation.controller;

import org.formation.dto.CoffeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@RestController
public class EmployeeGetCoffeeController {
	
	private RestTemplate restTemplate;

	@GetMapping("drink/id")
	public ResponseEntity<CoffeeDto>getById(@PathVariable Long id){
		ResponseEntity<CoffeeDto> coffee = restTemplate.getForEntity("http://localhost:8080/Coffees/"+id, CoffeeDto.class);
		log.info("=>"+coffee);
		return coffee;
	}
}
