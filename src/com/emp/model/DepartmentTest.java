package com.emp.model;

import com.emp.serviceImpl.DepartmentServiceImpl;

public class DepartmentTest {
public static void main(String[] args) {
	DepartmentServiceImpl deptservice=new DepartmentServiceImpl();
	Employee emp=new Employee(101,"ray",67890);
	Department dep1=new Department(111,"IT",emp);
	
	//deptservice.add(dep1);
	deptservice.add(emp, dep1);
	deptservice.display(dep1);
	
}
}
