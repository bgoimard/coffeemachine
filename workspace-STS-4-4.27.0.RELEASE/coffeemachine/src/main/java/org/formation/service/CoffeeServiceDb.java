package org.formation.service;

import java.util.List;
import java.util.Optional;

import org.formation.model.Coffee;
import org.formation.repository.CoffeeRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//import jakarta.annotation.PostConstruct;

@Service
@Primary
public class CoffeeServiceDb implements CoffeeService {
	
	private CoffeeRepository repository;
	
	public CoffeeServiceDb(CoffeeRepository repository) {
		this.repository = repository;
	}

	// pour eviter de reinserer les data on commente le @PostConstruct
	//@PostConstruct
	public void initDb() {
		this.repository.saveAll(List.of(new Coffee("From database"), new Coffee("Granador"), new Coffee("tres puntas"), new Coffee("robusta")));
		
	}

	@Override
	public List<Coffee> getAll() {
		return this.repository.findAll();
	}

	@Override
	public Coffee save(Coffee coffee) {
		return this.repository.save(coffee);
	}

	@Override
	public Optional<Coffee> getById(Long id) {
		return repository.findById(id);
	}
}
