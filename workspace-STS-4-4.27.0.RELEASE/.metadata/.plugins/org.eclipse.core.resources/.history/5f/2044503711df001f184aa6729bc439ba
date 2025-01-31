package org.formation.client;

import org.formation.dto.CoffeeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080/", value = "drink")
public interface CoffeeClient {
	
	@GetMapping("coffees/{id}")
	ResponseEntity<CoffeeDto> getCoffeeById(@PathVariable Long id);

}
