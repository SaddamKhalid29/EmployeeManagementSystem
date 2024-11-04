package com.example.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeemanagementsystem.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
