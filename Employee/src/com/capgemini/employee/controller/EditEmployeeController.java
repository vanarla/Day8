
package com.capgemini.employee.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.employee.dao.EmployeeDao;
import com.capgemini.employee.model.Employee;



@WebServlet("/editEmployee")
public class EditEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;
	private ServletContext context;
	
    public EditEmployeeController() {
        super();
        
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	context = config.getServletContext();
    }
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		int empId = Integer.parseInt(request.getParameter("empId"));
		String empName = request.getParameter("empName");
		double empSalary = Double.parseDouble(request.getParameter("empSalary"));
		String empDept = request.getParameter("empDept");
		employeeDao = (EmployeeDao) context.getAttribute("employeeDao");
		Employee employee = new Employee(empId, empName, empSalary, empDept);
		employeeDao.updateEmployee(employee);
		response.sendRedirect("getAllEmployees");
		
		
		
	}

}