package com.soumyadeep.springboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

	@Before(value = "execution(* com.soumyadeep.springboot.service.EmployeeService.*(..)) and args(empName,empId)")
	public void beforeAdvice(JoinPoint joinPoint, String empName, String empId) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating Employee with name - " + empName + " and id - " + empId);
	}

	@After(value = "execution(* com.soumyadeep.springboot.service.EmployeeService.*(..)) and args(empName,empId)")
	public void afterAdvice(JoinPoint joinPoint, String empName, String empId) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created Employee with name - " + empName + " and id - " + empId);
	}

}
