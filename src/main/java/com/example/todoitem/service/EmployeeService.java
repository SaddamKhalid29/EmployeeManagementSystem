package com.example.todoitem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoitem.model.Employee;
import com.example.todoitem.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	public List<Employee> getAllEmployeesRecord() {
		
		
		return employeeRepo.findAll();
	}

	public void createNewEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		employeeRepo.save(employee);
	}
	
	
	
}
