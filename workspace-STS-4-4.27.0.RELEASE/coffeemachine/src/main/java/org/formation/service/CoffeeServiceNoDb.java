package org.formation.service;

import java.util.List;
import java.util.Optional;

import org.formation.model.Coffee;

//import org.springframework.stereotype.Service;

//@Service
public class CoffeeServiceNoDb implements CoffeeService {
	
	@Override
	public Optional<Coffee> getById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Coffee> getAll() {
		return List.of(new Coffee("Granador"), new Coffee("tres puntas"), new Coffee("robusta"));
	}

	@Override
	public Coffee save(Coffee coffee) {
		return coffee;
	}

}
