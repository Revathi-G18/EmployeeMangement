package com.emp.model;

import java.util.List;
//1)Why EmployeeList class??
//2)display method you can write in impl class
//3)why so many classes in model package?  There should be only two model classes.
public class EmployeeList {
public void display(List<EmployeeDetails> empList){
	for(EmployeeDetails e:empList){
		System.out.println(e);
	}
}
}
