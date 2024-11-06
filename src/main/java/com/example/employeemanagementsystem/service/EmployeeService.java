package com.example.employeemanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepo;

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

	public Optional<Employee> getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id);
	}
	
	
	
}
