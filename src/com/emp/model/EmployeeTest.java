package com.emp.model;

import java.util.Arrays;
import java.util.Collections;

import com.emp.serviceImpl.EmployeeServiceImpl;

public class EmployeeTest {
public static void main(String[] args) {
	
	EmployeeServiceImpl impl=new EmployeeServiceImpl();
	Employee emp=new Employee(101,"ray",67890);
	Employee emp1=new Employee(201,"mellisa",56789);
	
	impl.save(emp);
	impl.save(emp1);
	//impl.delete(201);
	impl.display();
	//impl.update(emp);
	
	impl.display();
	impl.get();
	//Collections.sort(empList,new Employee(101,"ray",67890));
	//impl.display();
	//System.out.println(impl.get(201));
		
}
}
