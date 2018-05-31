package com.emp.service;

import java.util.List;

import com.emp.model.Employee;

public interface EmployeeService {
public boolean save(Employee emp);
public boolean update(Employee emp);
public boolean delete(int id);
public Employee get(int id);
public List<Employee> get();
public void display(Employee emp);
public void display();
public void display(List<Employee> emp);
public List<Employee> getAllEmployees(int salary);
public List<Employee> get(int min,int max);
}
