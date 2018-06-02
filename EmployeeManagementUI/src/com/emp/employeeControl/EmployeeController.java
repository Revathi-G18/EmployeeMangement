package com.emp.employeeControl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.db.EmployeeServiceImplDB;
import com.emp.model.Employee;
import com.emp.service.EmployeeService;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int salary=Integer.parseInt(request.getParameter("salary"));
		int deptId=Integer.parseInt(request.getParameter("deptId"));
		
		EmployeeService employeeservice=new EmployeeServiceImplDB();
		Employee employee;
		employee=new Employee(id,name,salary,deptId);
		employeeservice.save(employee);
		RequestDispatcher requestDispatcher;
		
		if(employeeservice.save(employee))
		{
			requestDispatcher=request.getRequestDispatcher("Success.html");
			requestDispatcher.forward(request, response);
		}
		else
		{
			requestDispatcher=request.getRequestDispatcher("Employee.html");
			PrintWriter printwriter=response.getWriter();
			printwriter.println("invalid input");
			requestDispatcher.include(request, response);
		}
		
		//doGet(request, response);
	}
}
