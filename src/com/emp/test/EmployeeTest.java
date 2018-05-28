package com.emp.test;

import java.util.Arrays;
import java.util.Collections;

import com.emp.model.Employee;
import com.emp.serviceImpl.EmployeeServiceImpl;

public class EmployeeTest {
	public static void main(String[] args) {

		EmployeeServiceImpl impl = new EmployeeServiceImpl();
		Employee emp;
		emp = new Employee(101, "ray", 67890);
		impl.save(emp);
		emp = new Employee(201, "mellisa", 56789);
		impl.save(emp);
		emp = new Employee(132, "Aria", 789000);
		impl.save(emp);
		emp = new Employee(234, "Emily", 7678);
		impl.save(emp);
		// impl.delete(201);//delete particular employee from list
		impl.display();//display all employee
		emp = new Employee(101, "Spencer", 783000);//updates the existig employee with id
		impl.update(emp);
		impl.display();
		impl.get();//gets whole employee list
		// System.out.println(impl.get(201));//prints particular record from list
		System.out.println("================");
		System.out.println(impl.getAllEmployees(7000));
		System.out.println(impl.get(3000, 200000));
		System.out.println(impl.getAllEmployees(20000));

	}
}
