package com.emp.model;

public class Department {
	private int DepartmentId;
	private String DepartmentName;
	private Employee Employee;

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

	public Employee getEmployee() {
		return Employee;
	}

	public void setEmployee(Employee employee) {
		Employee = employee;
	}

	public Department(int departmentId, String departmentName, com.emp.model.Employee employee) {
		super();
		DepartmentId = departmentId;
		DepartmentName = departmentName;
		Employee = employee;
	}

}
