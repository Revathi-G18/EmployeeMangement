package com.emp.service;

import java.util.List;

import com.emp.model.Department;
import com.emp.model.Employee;

public interface DepartmentService {
public boolean add(Department department);
public boolean update(Department department);
public boolean delete(int departmentId);
public Department get(int departmentId);
public boolean add(Employee emp, Department department);
//public boolean add(int empid,int departmentId); 
public boolean delete(int empid,int departmentId);
public List<Employee> getEmployees(int empId);
public List<Employee> getEmployees(int deptId,int amount);
public List<Employee> getEmployees(int deptId,int min,int max);
void display();

}
