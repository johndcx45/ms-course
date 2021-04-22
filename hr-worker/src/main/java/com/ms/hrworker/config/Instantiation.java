package com.ms.hrworker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ms.hrworker.entities.Worker;
import com.ms.hrworker.repositories.WorkerRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@Override
	public void run(String... args) {
		Worker worker1 = new Worker(1L, "Bob", 200.0);
		Worker worker2 = new Worker(2L, "Maria", 300.0);
		Worker worker3 = new Worker(3L, "Alex", 250.0);
		
		workerRepository.save(worker1);
		workerRepository.save(worker2);
		workerRepository.save(worker3);
	}
}
