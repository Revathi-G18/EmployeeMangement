package com.emp.model;

import java.util.Arrays;
import java.util.Collections;

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
		// impl.delete(201);
		impl.display();
		emp = new Employee(101, "Spencer", 783000);
		impl.update(emp);

		impl.display();
		impl.get();
		impl.update(emp);
		// Collections.sort(empList,new Employee(101,"ray",67890));
		// impl.display();
		// System.out.println(impl.get(201));

	}
}
