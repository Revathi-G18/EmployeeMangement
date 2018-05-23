package com.emp.serviceImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	//Employee employee ;// null will be stored in this object if we try to access this it will return null pointer exception
	List<Employee> empList =new ArrayList<Employee>();

	@Override
	public boolean save(Employee emp) {
		if(get(emp.getId())!=null){
			return false;
		}
		empList.add(emp);
		return true;
	}

	@Override
	public boolean update(Employee emp) {
		if(get(emp.getId())==null){
			return false;
		}		
		//empList.set((empList.indexOf(emp.getId())), emp.setId(123));
		//empList.get(index).setName("roy");
		Employee temp=get(emp.getId());
		empList.remove(temp);
		//.setSalary(13000);
		empList.add(emp);
		return true;
	}
	
	@Override
	public boolean delete(int id) {
		Employee empl=get(id);
		if(empl!=null){
			empList.remove(empl);
		}
		
		return false;
	}

	@Override
	public Employee get(int id) {	
		for(Employee emp:empList){
			if(emp.getId()==id){
				return emp;
			}
		}
		return null;
	}

	@Override
	public List<Employee> get() {
		/*for(Employee list:empList){
			
		}*/
		return empList;
	}

	@Override
	public void display(Employee emp) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	}

	@Override
	public void display() {
		for(Employee empl : empList){
			display(empl);
		}
		
	}

	@Override
	public List<Employee> get(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeServiceImpl [empList=" + empList + "]";
	}

	
	
}
