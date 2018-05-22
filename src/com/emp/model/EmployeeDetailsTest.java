package com.emp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDetailsTest {
public static void main(String[] args) {
	List<EmployeeDetails> empdetail=new ArrayList<EmployeeDetails>();
	EmployeeDetails details =new EmployeeDetails(22,"ray",6666);
	EmployeeDetails details1 =new EmployeeDetails(25,"fitz",6688);
	empdetail.add(details);
	empdetail.add(details1);
	Collections.sort(empdetail,new EmployeeDetails());
	details.display(empdetail);
	
}
}
