package com.soumyadeep.springboot.service;

import org.springframework.stereotype.Service;

import com.soumyadeep.springboot.model.Employee;

@Service
public class EmployeeService {

	public Employee addEmployee(String empName, String empId) {

		Employee employee=new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		return employee;
	}

	public void deleteEmployee(String empName) {

		// do not delete
	}
}
