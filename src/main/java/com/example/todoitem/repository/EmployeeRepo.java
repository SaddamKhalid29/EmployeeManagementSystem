package com.example.todoitem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todoitem.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
