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
		if(getdep(department.getDepartmentId())==null){
			DeptList.add(department);
		}
		
		return false;
	}

	@Override
	public boolean update(Department department) {
		if(getdep(department.getDepartmentId())==null){
			DeptList.add(department);
		}
		
		return false;
	}

	@Override
	public boolean delete(int departmentId) {
		Department de=getdep(departmentId);
		if(de!=null){
			DeptList.remove(de);
		}		
		return false;
	}
	@Override
	public void getAllDepartments() {
		String depName="";
		for(int i=0;i<DeptList.size();i++){
			depName=DeptList.get(i).getDepartmentName();
			System.out.println(depName);
		}
	}

	@Override
	public Department getdep(int departmentId) {
		for(Department dep:DeptList){
			if(dep.getDepartmentId()==departmentId){
				return dep;
			}
		}
		return null;
	}
	public Department getemp(int Id) {
		for(Department em:DeptList){
			if(em.getEmployee().getId()==Id){
				return em;
			}
		}
		return null;
	}
	
	@Override
	public Boolean addEmployeeToDepartment(int empID, int deptID) {
		if(getemp(empID)!=null && getdep(deptIdD)!=null){
			DeptList.add(empID);
		}
		return false;
	}
	
	@Override
	public boolean deleteEmployeefromDepartment(int deptId,int empId) {
		Department de=getdep(deptId);
		Department em=getemp(empId);
		if(de!=null &&(em!=null)){
			DeptList.remove(empId);
			return true;
		}		
		return false;
	}

	@Override
	public List<Employee> getEmployees(int empId) {
		
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
	}

	@Override
	public String toString() {
		return "DepartmentServiceImpl [DeptList=" + DeptList + "]";
	}

	@Override
	public Employee getemp(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	}
