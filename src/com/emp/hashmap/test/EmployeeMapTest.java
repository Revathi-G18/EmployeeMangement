package com.emp.hashmap.test;

import java.util.HashMap;

import com.emp.hashmap.EmployeeServiceImplHash;
import com.emp.model.Employee;
import com.emp.service.EmployeeService;

public class EmployeeMapTest {
public static void main(String[] args) {
	EmployeeService employeeMap=new EmployeeServiceImplHash();
	Employee emp;
	emp = new Employee(101, "ray", 67890);
	employeeMap.save(emp);
	emp = new Employee(201, "mellisa", 56789);
	employeeMap.save(emp);
	emp = new Employee(132, "Aria", 789000);
	employeeMap.save(emp);
	emp = new Employee(234, "Emily", 7678);
	employeeMap.save(emp);
	System.out.println(employeeMap.get());
	employeeMap.delete(101);
	System.out.println(employeeMap.get());
	emp = new Employee(132,"Ezra",10000);
	employeeMap.update(emp);
	System.out.println(employeeMap.get());
	System.out.println(employeeMap.get(234));
	System.out.println(employeeMap.getAllEmployees(8000));
	System.out.println(employeeMap.get(15000, 70000));
	
}
}
