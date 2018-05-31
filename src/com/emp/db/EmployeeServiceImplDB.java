package com.emp.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

public class EmployeeServiceImplDB implements EmployeeService{
	private Connection con;
	private PreparedStatement prepareStatement;
	List<Employee> empList;
	
	
	public EmployeeServiceImplDB() {
		empList =new ArrayList<Employee>();
	}

	@Override
	public boolean save(Employee emp) {
		con=DBConnection.getConnection();
		try {
			prepareStatement=con.prepareStatement("insert into employee values(?,?,?,?);");
			prepareStatement.setInt(1, emp.getId());
			prepareStatement.setString(2, emp.getName());
			prepareStatement.setInt(3, emp.getSalary());
			prepareStatement.setInt(4, emp.getDeptId());
			prepareStatement.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Employee emp) {
		con=DBConnection.getConnection();
		try {
			prepareStatement=con.prepareStatement("update employee set name=?, salary=?, deptId=? where id=?");
			prepareStatement.setString(1, emp.getName());
			prepareStatement.setInt(2, emp.getSalary());
			prepareStatement.setInt(3, emp.getDeptId());
			prepareStatement.setInt(4, emp.getId());
			if(prepareStatement.executeUpdate()>0)
			return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}	return false;	
	}

	@Override
	public boolean delete(int id) {
		con=DBConnection.getConnection();
		try {
			prepareStatement=con.prepareStatement("delete from employee where id=?");
			prepareStatement.setInt(1, id);
			prepareStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(List<Employee> emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees(int salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> get(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

}
