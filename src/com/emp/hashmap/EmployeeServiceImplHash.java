package com.emp.hashmap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

public class EmployeeServiceImplHash implements EmployeeService {
	Map<Integer,Employee> empMap;

	public EmployeeServiceImplHash() {
		empMap=new HashMap<Integer,Employee>();
	}

	public EmployeeServiceImplHash(HashMap<Integer,Employee> empmap) {
		this.empMap = empmap;
	}

	@Override
	public boolean save(Employee emp) {
			if(empMap.containsKey(emp)){
			return false;
			}
		empMap.put(emp.getId(),emp);
		return true;
	}

	@Override
	public boolean update(Employee emp) {
		if(empMap.containsKey(emp.getId())){
			empMap.remove(emp);
			empMap.put(emp.getId(), emp);
			return true;
			}
		return false;
	}

	@Override
	public boolean delete(int id) {
		if(empMap.containsKey(id)){
			empMap.remove(id);
			}		
		return false;
	}

	@Override
	public Employee get(int id) {
		return empMap.get(id);
	}

	@Override
	public List<Employee> get() {
		//List<Employee> emp=(List<Employee>) empMap;
	//return	new ArrayList<Employee>((Collection<? extends Employee>) empMap.entrySet());
	//	return (List<Employee>) empMap;
		Collection<Employee> values = empMap.values();
		ArrayList<Employee> listOfValues = new ArrayList<Employee>(values);
		return listOfValues;
	}

	@Override
	public void display(Employee emp) {
		
		/*System.out.println(empMap.get(emp));
		empMap.get(emp.getName());		empMap.get(emp.getSalary());*/
		// TODO Auto-generated method stub
	}

	@Override
	public void display() {
		/*for(Employee emp:empMap.values()){
			display(emp);
		}*/
		// TODO Auto-generated method stub
	}

	@Override
	public void display(List<Employee> emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees(int salary) {
		Collection<Employee> employees= empMap.values();
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>(employees);
		List<Employee> salaryList=new ArrayList<Employee>();
		for (Employee emp : listOfEmployees){
		if(emp.getSalary()>salary){
			salaryList.add(emp);
		}
		}		
		return salaryList;
	}

	@Override
	public List<Employee> get(int min, int max) {
		Collection<Employee> employees= empMap.values();
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>(employees);
		List<Employee> salaryList=new ArrayList<Employee>();
		for (Employee emp : listOfEmployees){
		if(emp.getSalary()>min && emp.getSalary()<max){
			salaryList.add(emp);
		}
		}		
		return salaryList;
	}
		
}
