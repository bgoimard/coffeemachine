package org.formation.controller;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.formation.Greeting;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
	private final Greeting greeting;
	

	
	public GreetingController(Greeting greeting) {
		this.greeting = greeting;
	}

	//@Value("${greeting.name: Mirage}")
	//private String name;
	
	//@Value("${greeting.coffee: ${greeting.name} is ok}")
	//private String coffee;
	
	@GetMapping
	String getGreeting() {
		//return name;
		return greeting.getName();
	}
	
	@GetMapping("/coffee")
	String getNameAndCoffee() {
		//return coffee;
		return greeting.getCoffee();
	}

}
