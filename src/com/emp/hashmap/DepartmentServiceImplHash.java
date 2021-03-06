package com.emp.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.emp.model.Department;
import com.emp.model.Employee;
import com.emp.service.DepartmentService;
import com.emp.service.EmployeeService;

public class DepartmentServiceImplHash implements DepartmentService {
	Map<Integer, Department> deptMap;
	private EmployeeService empservice;

	public DepartmentServiceImplHash(EmployeeService empservice) {
		deptMap = new HashMap<Integer, Department>();
		//empservice = new EmployeeServiceImplHash();
		this.empservice = empservice;
	}
	@Override
	public boolean add(Department department) {
		if(deptMap!=null){
		if (deptMap.containsKey(department)) {
			return false;
		}}
		deptMap.put(department.getDepartmentId(), department);
		return true;
	}

	@Override
	public boolean update(Department department) {
		if (deptMap.containsKey(department.getDepartmentId())) {
			deptMap.remove(department);
			deptMap.put(department.getDepartmentId(), department);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int departmentId) {
		if (deptMap.containsKey(departmentId)) {
			deptMap.remove(departmentId);
		}
		return false;
	}

	@Override
	public Department getdep(int departmentId) {
		Department dept = null;
		if (deptMap.containsKey(departmentId)) {
			dept = deptMap.get(departmentId);
		}
		return dept;
	}

	@Override
	public void getAllDepartmentName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(Department dep) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addEmployeeToDepartment(int empId, int deptId) {
		Employee emp = empservice.get(empId);
		Department dep = getdep(deptId);
		List<Employee> empList = getEmployees(deptId);
		if (emp == null || dep == null) {
			return false;
		}
		//HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		/*if (empList != null) {
			for (Employee employee : empList) {
				empMap.put(employee.getId(), employee);
			}
		} else*/
		if(empList==null){
			empList = new ArrayList<Employee>();
		}
		empList.add(emp);
		dep.setEmployeeList(empList);
		deptMap.put(deptId, dep);

		return true;

	}

	/*public boolean isExist(int empId, int DeptId) {
		List<Employee> Emplist = getEmployees(DeptId);
		HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		if (Emplist == null) {
			return false;
		}
		for (Employee emp : Emplist) {
			empMap.put(emp.getId(), emp);
		}
		if (empMap.containsKey(empId)) {
			return true;
		}
		return false;
	}*/

	@Override
	public boolean deleteEmployeefromDepartment(int deptId, int empId) {
		Employee emp = empservice.get(empId);
		Department dep = getdep(deptId);
		List<Employee> empList = getEmployees(deptId);
		if (emp == null || dep == null) {
			return false;
		}		
		if(empList==null){
			empList = new ArrayList<Employee>();
			}
		empList.remove(emp);
			return true;
	}

	@Override
	public List<Department> getdepartment() {
		Collection<Department> Dept = deptMap.values();
		ArrayList<Department> listOfDept = new ArrayList<>(Dept);
		return listOfDept;
	}

	@Override
	public List<Employee> getEmployees(int DeptId) {
		List<Department> DList = getdepartment();
		for (Department dept : DList) {
			if (DeptId == dept.getDepartmentId()) {
				return dept.getEmployeeList();
			}
		}
		return null;
	}

	@Override
	public List<Employee> getEmployees(int deptId, int amount) {
		List<Employee> salaryList=new ArrayList<Employee>();
		Department dep=getdep(deptId);
		
		List<Employee> EmpList=dep.getEmployeeList();
		for(Employee emp:EmpList){
			if(emp.getSalary()>amount){
				salaryList.add(emp);
			}
		}		
		return salaryList; 
	}

	@Override
	public List<Employee> getEmployees(int deptId, int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override

	public void display() {
		// TODO Auto-generated method stub

	}

}
