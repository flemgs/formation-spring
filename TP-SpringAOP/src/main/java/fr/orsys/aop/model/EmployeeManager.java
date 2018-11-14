package fr.orsys.aop.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {
	public Employee getEmployeeById(int employeeId) {
		System.out.println("EmployeeManager.getEmployeeById " + employeeId);
		return new Employee(employeeId, "", "");
	}
	
	public List<Employee> getAllEmployees() {
		System.out.println("EmployeeManager.getAllEmployees");
		return new ArrayList<Employee>();
	}
	
	public void createEmployee(Employee employee) {
		System.out.println("EmployeeManager.createEmployee");
	}
	
	public void deleteEmployee(int employeeId) {
		System.out.println("EmployeeManager.deleteEmployee " + employeeId);
	}
	
	public void updateEmployee(Employee employee) {
		System.out.println("EmployeeManager.updateEmployee");
	}
}
