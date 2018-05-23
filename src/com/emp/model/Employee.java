package com.emp.model;

public class Employee {
private int id;
private String Name;
private int Salary;

public Employee() {
	super();
}
public Employee(int id, String name, int salary) {
	super();
	this.id = id;
	Name = name;
	Salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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


}
