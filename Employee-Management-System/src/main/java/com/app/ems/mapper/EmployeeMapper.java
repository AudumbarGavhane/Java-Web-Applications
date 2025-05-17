package com.app.ems.mapper;

import com.app.ems.dto.EmployeeDto;
import com.app.ems.model.Employee;

public class EmployeeMapper {
		
	public static EmployeeDto mapEmployeeToEmployeeDto(Employee employee) {
		return new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail()
				
				);
	}
	
	
	public static Employee mapEmployeeDtoToEmployee(EmployeeDto employeeDto) {
		
		return new Employee(
				employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail()
				);
	}
}
