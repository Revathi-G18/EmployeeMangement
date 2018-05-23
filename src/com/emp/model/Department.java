package com.emp.model;

import java.util.List;

public class Department {
	private int DepartmentId;
	private String DepartmentName;
	private List<Employee> EmployeeList;

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

	

	public List<Employee> getEmployeeList() {
		return EmployeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		EmployeeList = employeeList;
	}

	public Department(int departmentId, String departmentName) {
		super();
		DepartmentId = departmentId;
		DepartmentName = departmentName;
	}

		

}
