package fr.orsys.aop.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeCRUDASpect {

	@Before("execution(* EmployeeManager.getEmployeeById(..))")
	public void logBeforeV1(JoinPoint joinPoint) {
		System.out.println("EmployeeCRUDASpect.logBeforeV1: " + joinPoint.getSignature().getName());
	}
	
	@After("execution(* EmployeeManager.getEmployeeById(..))")
	public void logAfterV1(JoinPoint joinPoint) {
		System.out.println("EmployeeCRUDASpect.logAfterV1: " + joinPoint.getSignature().getName());
	}
	
	@Around("execution(* EmployeeManager.getEmployeeById(..))")
	public Object logAroundV1(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("Around => Before getEmployeeById ");
		Employee employee = null;
		try {
			employee = (Employee) proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Around => After getEmployeeById. Returned value: " + employee.getId());
		return employee;
	}
	
	@AfterReturning(value="execution(* EmployeeManager.getEmployeeById(..))",
					returning="employee")
	public void logAfterV2(JoinPoint joinPoint, Employee employee) {
		System.out.println("EmployeeCRUDASpect.logAfterV2: " + joinPoint.getSignature().getName() + " " + employee.getId());
	}
	
//	@After("execution(* *(..))")
//	public void logAfterAll(JoinPoint joinPoint) {
//		System.out.println("EmployeeCRUDASpect.logAfterAll: " + joinPoint.getSignature().getName());
//	}
}
