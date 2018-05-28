package com.emp.test;

import java.util.List;

import com.emp.model.Department;
import com.emp.model.Employee;
import com.emp.service.DepartmentService;
import com.emp.service.EmployeeService;
import com.emp.serviceImpl.DepartmentServiceImpl;
import com.emp.serviceImpl.EmployeeServiceImpl;

public class DepartmentTest {
	private static DepartmentService deptservice;
	private static EmployeeService empservice;

	public static void init() {
		empservice = new EmployeeServiceImpl();
		deptservice = new DepartmentServiceImpl(empservice);

		Employee emp;
		emp = new Employee(101, "ray", 67890);
		empservice.save(emp);
		emp = new Employee(201, "mellisa", 56789);
		empservice.save(emp);
		emp = new Employee(132, "Aria", 789000);
		empservice.save(emp);
		emp = new Employee(234, "Emily", 7678);

		Department dep1;
		dep1 = new Department(111, "IT");
		deptservice.add(dep1);
		dep1 = new Department(121, "QA");
		deptservice.add(dep1);
		dep1 = new Department(123, "Network");
		deptservice.add(dep1);
	}

	public static void main(String[] args) {
		init();
		// deptservice.deleteEmployeefromDepartment(111, 101); //delets employee
		// id from department
		// deptservice.delete(111); //delete department
		// deptservice.getAllDepartmentName();//prints all departments in
		// depList
		// dep1=new Department(123,"Testing"); //to update creating object with
		// deptId which we want to update
		// deptservice.update(dep1);
		
		deptservice.addEmployeeToDepartment(101, 123);
		System.out.println(deptservice.getdepartment());
		deptservice.addEmployeeToDepartment(201, 123);
		System.out.println(deptservice.getdepartment());
		deptservice.addEmployeeToDepartment(201, 123);
		System.out.println(deptservice.getdepartment());
		deptservice.addEmployeeToDepartment(132, 111);
		System.out.println(deptservice.getdepartment());
		deptservice.addEmployeeToDepartment(234, 121);
		System.out.println(deptservice.getdepartment());
		//deptservice.deleteEmployeefromDepartment(123, 101);
		//System.out.println(deptservice.getdepartment());
		//deptservice.getEmployees(123);
		//System.out.println(deptservice.getdepartment());
		//deptservice.deleteEmployeefromDepartment(123, 101);
		//System.out.println(deptservice.getdepartment());
		//System.out.println(deptservice.getEmployees(123, 700));// displays employees in the department whose salary is greater than 700
		//System.out.println(deptservice.getEmployees(123, 10000, 60000));//displays employees in the department whose salary is greater than 10k n less than 60k
		// deptservice.display();
		}
}
