package com.emp.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.emp.model.Department;
import com.emp.model.Employee;
import com.emp.service.DepartmentService;
import com.emp.service.EmployeeService;

public class DepartmentServiceImpl implements DepartmentService {
	private List<Department> DeptList;
	EmployeeService employeeservice;

	public DepartmentServiceImpl() {
		DeptList = new ArrayList<Department>();
		employeeservice = new EmployeeServiceImpl();
	}

	public DepartmentServiceImpl(EmployeeService empservice) {
		DeptList = new ArrayList<Department>();
		this.employeeservice = empservice;
	}

	@Override
	public boolean add(Department department) {
		if (getdep(department.getDepartmentId()) == null) {
			DeptList.add(department);
			return true;
		}

		return false;
	}

	@Override
	public boolean update(Department department) {
		if (getdep(department.getDepartmentId()) == null) {
			return false;
		}
		Department temp = getdep(department.getDepartmentId());
		DeptList.remove(temp);
		DeptList.add(department);
		return true;
	}

	@Override
	public boolean delete(int departmentId) {
		Department de = getdep(departmentId);
		if (de != null) {
			DeptList.remove(de);
		}
		return false;
	}

	@Override
	public void getAllDepartmentName() {
		String depName = "";
		for (int i = 0; i < DeptList.size(); i++) {
			depName = DeptList.get(i).getDepartmentName();
			System.out.println(depName);
		}
	}

	@Override
	public Department getdep(int departmentId) {
		for (Department dep : DeptList) {
			if (dep.getDepartmentId() == departmentId) {
				return dep;
			}
		}
		return null;
	}

	@Override
	public boolean addEmployeeToDepartment(int empId, int deptId) {
		Employee emp = employeeservice.get(empId);
		Department dep = getdep(deptId);
		List<Employee> empList = getEmployees(deptId);
		DeptList.remove(dep);

		if (emp == null || dep == null) {
			return false;
		}
		if (empList == null) {
			empList = new ArrayList<Employee>();
		}
		isExist(empId, deptId);
		empList.add(emp);
		dep.setEmployeeList(empList);
		DeptList.add(dep);
		return true;
	}

	public boolean isExist(int empId, int DeptId) {
		List<Employee> Emplist = getEmployees(DeptId);
		if (Emplist == null) {
			return false;
		}
		for (Employee emp : Emplist) {
			if (emp.getId() == empId) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean deleteEmployeefromDepartment(int deptId, int empId) {
		Employee emp = employeeservice.get(empId);
		Department dep = getdep(deptId);
		if (emp == null || dep == null) {
			return false;
		}
		List<Employee> empList = getEmployees(deptId);
		if (empList == null) {
			empList = new ArrayList<Employee>();
		}
		isExist(empId, deptId);
		empList.remove(emp);
		// dep.setEmployeeList(empList);
		// DeptList.add(dep);
		return true;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees(int deptId, int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	public void display(Department dep) {
		System.out.println(dep);
		List<Employee> emp = dep.getEmployeeList();
		employeeservice.display(emp);
	}

	@Override
	public void display() {
		for (Department dep : DeptList) {
			display(dep);
		}
	}

	@Override
	public List<Department> getdepartment() {
		// TODO Auto-generated method stub
		return DeptList;
	}

	@Override
	public String toString() {
		return "DepartmentServiceImpl [DeptList=" + DeptList + "]";
	}
}
