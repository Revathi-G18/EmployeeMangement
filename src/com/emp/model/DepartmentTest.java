package com.emp.model;

import com.emp.serviceImpl.DepartmentServiceImpl;

public class DepartmentTest {
public static void main(String[] args) {
	DepartmentServiceImpl deptservice=new DepartmentServiceImpl();
	Employee emp=new Employee(101,"ray",67890);
	Employee emp1=new Employee(203,"roy",8907);
	Employee emp2=new Employee(444,"benham",9000);
	Department dep1=new Department(111,"IT",emp);
	Department dep2=new Department(121,"QA",emp1);
	Department dep3=new Department(123,"Network",emp2);
	deptservice.add(dep1);
	deptservice.add(dep2);
	deptservice.add(dep3);
	//System.out.println(deptservice.getemp(203));
	//deptservice.deleteEmployeefromDepartment(111, 101);
	//deptservice.delete(111);
	//deptservice.add(emp, dep1);//is this necessary
	deptservice.getAllDepartments();
	//deptservice.display();
	
}
}
