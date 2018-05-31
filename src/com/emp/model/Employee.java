package com.emp.model;

public class Employee {
private int id;
private String Name;
private int Salary;
private int deptId;

public Employee() {
	super();
}
public Employee(int id, String name, int salary) {
	super();
	this.id = id;
	Name = name;
	Salary = salary;
}

public Employee(int id, String name, int salary, int deptId) {
	super();
	this.id = id;
	Name = name;
	Salary = salary;
	this.deptId = deptId;
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

public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", Name=" + Name + ", Salary=" + Salary + "]";
}
public void setSalary(int salary) {
	Salary = salary;
	}
}
