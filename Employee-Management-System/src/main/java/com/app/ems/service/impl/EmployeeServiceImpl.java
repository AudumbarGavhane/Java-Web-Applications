package com.app.ems.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ems.dto.EmployeeDto;
import com.app.ems.exception.ResourceNotFoundException;
import com.app.ems.mapper.EmployeeMapper;
import com.app.ems.model.Employee;
import com.app.ems.repository.EmployeeRepository;
import com.app.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		
		Employee employee = EmployeeMapper.mapEmployeeDtoToEmployee(employeeDto);
		employeeRepository.save(employee);
		return EmployeeMapper.mapEmployeeToEmployeeDto(employee);
	}
	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId)
		 					.orElseThrow(()->new ResourceNotFoundException("Employee is not exists with the given id : "+employeeId));
		return EmployeeMapper.mapEmployeeToEmployeeDto(employee);
	
	}
	public List<EmployeeDto> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		List<EmployeeDto> employeeDtoList=new ArrayList<>();
		for(Employee employee :employees) {
	    employeeDtoList.add(EmployeeMapper.mapEmployeeToEmployeeDto(employee));
		}
		return employeeDtoList;//(ArrayList<EmployeeDto>)
	}
	@Override
	public boolean deleteEmployeeById(Long employeeId) {
		if(employeeRepository.existsById(employeeId)) {
			employeeRepository.deleteById(employeeId);
			return true;
		}
		return false;
	}
	@Override
	public EmployeeDto updateEmployeeById(Long employeeId,EmployeeDto updatedEmployee) {
			
		Employee existingEmployee = employeeRepository.findById(employeeId)
			    .orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with the given id: " + employeeId));

			existingEmployee.setFirstName(updatedEmployee.getFirstName());
			existingEmployee.setLastName(updatedEmployee.getLastName());
			existingEmployee.setEmail(updatedEmployee.getEmail());

			Employee saved = employeeRepository.save(existingEmployee);

			return EmployeeMapper.mapEmployeeToEmployeeDto(saved);
	}

}
