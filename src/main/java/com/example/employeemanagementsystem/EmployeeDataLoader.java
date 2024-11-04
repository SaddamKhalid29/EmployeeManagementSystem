package com.example.employeemanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepo;

@Configuration
public class EmployeeDataLoader {

	
	@Autowired
	EmployeeRepo employeerepo;

	@Bean
	public CommandLineRunner loadData() {
		
		return args ->{
			employeerepo.save(new Employee("Qiyas", 24,"QiyasKhan45@gmail.com"));
			employeerepo.save(new Employee("Ahmed", 20,"ahmed90@gmail.com"));
			employeerepo.save(new Employee("Nouman", 26,"noumi76@gmail.com"));
			
			System.out.println("Dummy data for employee is inserted in database");
		};
	}


}
