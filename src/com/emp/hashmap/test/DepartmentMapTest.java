package com.emp.hashmap.test;

import com.emp.hashmap.DepartmentServiceImplHash;
import com.emp.hashmap.EmployeeServiceImplHash;
import com.emp.model.Department;
import com.emp.model.Employee;
import com.emp.service.DepartmentService;
import com.emp.service.EmployeeService;
import com.emp.serviceImpl.DepartmentServiceImpl;
import com.emp.serviceImpl.EmployeeServiceImpl;

public class DepartmentMapTest {
	private static DepartmentService deptservice;
	private static EmployeeService empservice;

	public static void init() {
		empservice = new EmployeeServiceImplHash();
		deptservice = new DepartmentServiceImplHash(empservice);

		Employee emp;
		emp = new Employee(101, "ray", 67890);
		empservice.save(emp);
		emp = new Employee(201, "mellisa", 56789);
		empservice.save(emp);
		emp = new Employee(132, "Aria", 789000);
		empservice.save(emp);
		emp = new Employee(234, "Emily", 7678);
		empservice.save(emp);
		
		Department dept;
		dept = new Department(111, "IT");
		deptservice.add(dept);
		dept = new Department(121, "QA");
		deptservice.add(dept);
		dept = new Department(123, "Network");
		deptservice.add(dept);
	}
public static void main(String[] args) {
	init();
	//deptservice =new 	DepartmentServiceImplHash(empservice);
	//System.out.println(deptservice.getdepartment());
	//deptservice.delete(111);
	System.out.println(deptservice.getdepartment());
	Department dept=new Department(123, "CSC");
	deptservice.update(dept);
	System.out.println(deptservice.getdepartment());
	deptservice.addEmployeeToDepartment(101, 123);
	deptservice.addEmployeeToDepartment(234, 123);
	deptservice.addEmployeeToDepartment(201, 121);
	deptservice.addEmployeeToDepartment(132, 111);
	System.out.println(deptservice.getdepartment());
	deptservice.deleteEmployeefromDepartment(123, 101);
	System.out.println(deptservice.getdepartment());
	System.out.println(deptservice.getEmployees(123));
}
}
