package com.emp.test;

import java.util.List;

public class EmployeeList {
public void display(List<EmployeeDetails> empList){
	for(EmployeeDetails e:empList){
		System.out.println(e);
	}
}
}
