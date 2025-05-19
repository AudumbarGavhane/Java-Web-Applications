package com.app.ems.service;

import java.util.List;

import com.app.ems.dto.EmployeeDto;

public interface EmployeeService {
		EmployeeDto createEmployee(EmployeeDto employeeDto);
		EmployeeDto getEmployeeById(Long employeeId);
		List<EmployeeDto> getAllEmployees();
		boolean deleteEmployeeById(Long employeeId);
		EmployeeDto updateEmployeeById(Long employeeId, EmployeeDto updatedEmployee);
}