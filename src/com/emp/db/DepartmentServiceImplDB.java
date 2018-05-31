package com.emp.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.model.Department;
import com.emp.model.Employee;
import com.emp.service.DepartmentService;
import com.emp.service.EmployeeService;
import com.emp.serviceImpl.EmployeeServiceImpl;

public class DepartmentServiceImplDB implements DepartmentService {
	private List<Department> DeptList;
	private EmployeeService employeeservice;
	private Connection con;
	private PreparedStatement prepareStatement;	

	public DepartmentServiceImplDB() {
		DeptList = new ArrayList<Department>();
		employeeservice = new EmployeeServiceImpl();
	}

	public DepartmentServiceImplDB(EmployeeService employeeservice) {
		DeptList = new ArrayList<Department>();
		this.employeeservice = employeeservice;
	}

	@Override
	public boolean add(Department department) {
		con=DBConnection.getConnection();
		try {
			prepareStatement=con.prepareStatement("insert into department values(?,?);");
			prepareStatement.setInt(1, department.getDepartmentId());
			prepareStatement.setString(2, department.getDepartmentName());
			prepareStatement.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Department department) {
		con=DBConnection.getConnection();
		try {
			prepareStatement=con.prepareStatement("update department set deptname=? where deptid=?;");
			prepareStatement.setString(1, department.getDepartmentName());
			prepareStatement.setInt(2, department.getDepartmentId());
			prepareStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean delete(int departmentId) {
		con=DBConnection.getConnection();
		try {
			prepareStatement=con.prepareStatement("delete from department where deptid=?;");
			prepareStatement.setInt(1, departmentId);
			prepareStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public Department getdep(int departmentId) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeefromDepartment(int deptId, int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Department> getdepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees(int DeptId) {
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

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
