package com.emp.model;

import java.util.List;

import com.emp.serviceImpl.DepartmentServiceImpl;

public class DepartmentTest {
public static void main(String[] args) {
	DepartmentServiceImpl deptservice=new DepartmentServiceImpl();
	Employee emp;
	Department dep1;
	//emp=new Employee(101,"ray",67890);
	dep1=new Department(111,"IT");
	deptservice.add(dep1);
	//emp=new Employee(203,"roy",8907);
	dep1=new Department(121,"QA");
	deptservice.add(dep1);
	//emp=new Employee(444,"benham",9000);
	dep1=new Department(123,"Network");
	deptservice.add(dep1);
	//System.out.println(deptservice.getemp(203));
	//deptservice.deleteEmployeefromDepartment(111, 101);
	//deptservice.delete(111);
	//deptservice.add(emp, dep1);//is this necessary
	//deptservice.getAllDepartments();
	dep1=new Department(123,"Testing");
	deptservice.update(dep1);
	//deptservice.delete(121);
	deptservice.getAllDepartments();
	deptservice.display();
	
}
}
