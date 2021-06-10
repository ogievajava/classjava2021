package com.example.employee1;


	import org.springframework.data.repository.CrudRepository;

	public interface RepositoryEmployee extends CrudRepository<Employee,Integer> {
		
	}
