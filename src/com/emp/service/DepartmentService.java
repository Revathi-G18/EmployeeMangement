package com.emp.service;

import java.util.List;

import com.emp.model.Department;
import com.emp.model.Employee;

public interface DepartmentService {
public boolean add(Department department);
public boolean update(Department department);
public boolean delete(int departmentId);
  //use camel case
public Department getDep(int departmentId);
  //what is this method doing?  why return type is void?
public void getAllDepartmentName();
public void display(Department dep);
//public boolean add(Employee emp, Department department);
//public boolean add(int empid,int departmentId); 
public boolean addEmployeeToDepartment(int empId, int deptId);
    //use camel case
public boolean deleteEmployeeFromDepartment(int deptId,int empId);
public List<Department> getDepartment();
public List<Employee> getEmployees(int DeptId);
public List<Employee> getEmployees(int deptId,int amount);
public List<Employee> getEmployees(int deptId,int min,int max);
  //what is access specifier?
public void display();

}
