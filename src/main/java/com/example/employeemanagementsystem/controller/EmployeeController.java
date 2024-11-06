package com.example.employeemanagementsystem.controller;

import java.util.List;
import java.util.Optional;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.service.EmployeeService;

		
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/allemployees")
	public List<Employee> getAllEmployeesRecord(){
		
		
		return employeeService.getAllEmployeesRecord();
		
	
		
	}
	
	@GetMapping("/id/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable long id) {
		
		return employeeService.getEmployeeById(id);
		
	}
	
	
	//	http://localhost:8080/api/employee/random/employees?count=7

	@GetMapping("/random/employees")
	public List<Employee> getEmployeesRandomly(@RequestParam int count){
		List<Employee> employees = getAllEmployeesRecord();
		
		Collections.shuffle(employees) ;
		return employees.subList(0, Math.min(count, employees.size()));
		
	}
	
	@PostMapping("addemployee")
	public String employeeCreated(@RequestBody Employee employee) {
		
		employeeService.createNewEmployee(employee);
		return "New employee is addes to record successfully with the id "+ employee.getId();
		
		
	}
	
}
