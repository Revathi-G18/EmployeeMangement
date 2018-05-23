package com.emp.model;

import java.util.List;

public class Department {
	private int DepartmentId;
	private String DepartmentName;
	private List<Employee> Employee;

	public int getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public List<Employee> getEmployee() {
		return Employee;
	}

	public void setEmployee(List<Employee> employee) {
		Employee = employee;
	}

	public Department(int departmentId, String departmentName, List<com.emp.model.Employee> employee) {
		super();
		DepartmentId = departmentId;
		DepartmentName = departmentName;
		Employee = employee;
	}	

}
