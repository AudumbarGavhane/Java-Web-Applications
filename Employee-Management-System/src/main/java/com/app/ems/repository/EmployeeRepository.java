package com.app.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ems.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
		
}
