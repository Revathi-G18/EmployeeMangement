package com.emp.model;

import java.util.Comparator;
import java.util.List;

public class EmployeeDetails implements Comparator<EmployeeDetails> {

	private int Id;
	private String Name;
	private int Salary;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

	public EmployeeDetails(int id, String name, int salary) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
	}
	public EmployeeDetails(){}
	public void display(List<EmployeeDetails> empList){
		for(EmployeeDetails e:empList){
			System.out.println(e);
		}
	}

	/*@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		return o1.getSalary()-o2.getSalary();
	}*/
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
