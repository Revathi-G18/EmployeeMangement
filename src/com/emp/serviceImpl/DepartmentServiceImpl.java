package com.emp.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.emp.model.Department;
import com.emp.model.Employee;
import com.emp.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService{
	List<Department> DeptList =new ArrayList<Department>();
	@Override
	public boolean add(Department department) {
		if(get(department.getDepartmentId())==null){
			DeptList.add(department);
		}
		
		return false;
	}

	@Override
	public boolean update(Department department) {
		if(get(department.getDepartmentId())==null){
			DeptList.add(department);
		}
		
		return false;
	}

	@Override
	public boolean delete(int departmentId) {
		if(get(departmentId)!=null){
			DeptList.remove(departmentId);
		}		
		return false;
	}

	@Override
	public Department get(int departmentId) {
		for(Department dep:DeptList){
			if(dep.getDepartmentId()==departmentId){
				return dep;
			}
		}
		return null;
	}

	
	public boolean add(Employee emp, Department department) {
		if((get(department.getDepartmentId())!=null)&&(get(emp.getId())!=null)){
			DeptList.add(emp.getId(), department);
		}		
		return true;
	}

	@Override
	public boolean delete(int empid, int departmentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getEmployees(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees(int deptId, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees(int deptId, int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}
	public void display(Department dep) {
		System.out.println(dep.getDepartmentId());
		System.out.println(dep.getDepartmentName());
		System.out.println(dep.getEmployee().getId());
		System.out.println(dep.getEmployee().getName());
		System.out.println(dep.getEmployee().getSalary());

	}

	@Override
	public void display() {
		for(Department dep : DeptList){
			display(dep);
		}
	}}
