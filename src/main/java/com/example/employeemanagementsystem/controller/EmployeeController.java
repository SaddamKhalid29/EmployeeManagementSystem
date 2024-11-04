package com.example.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@PostMapping("addemployee")
	public String employeeCreated(@RequestBody Employee employee) {
		
		employeeService.createNewEmployee(employee);
		return "New employee is addes to record successfully with the id "+ employee.getId();
		
		
	}
}
