package com.soumyadeep.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soumyadeep.springboot.model.Employee;
import com.soumyadeep.springboot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)
	public Employee addEmployee(@RequestParam("empName") String empName, @RequestParam("empId") String empId) {

		return employeeService.addEmployee(empName,empId);
	}
	
	@RequestMapping(value = "/delete/employee", method = RequestMethod.GET)
	public String deleteEmployee(@RequestParam("empName") String empName, @RequestParam("empId") String empId) {

		employeeService.deleteEmployee(empName);
		
		return "Employee Deleted";
	}
}
