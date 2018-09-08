package com.capgemini.employee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.employee.dao.EmployeeDao;


@WebServlet("/deleteEmployee")
public class DeleteEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;
	private ServletContext context;
  
    public DeleteEmployeeController() {
        super();
    }

    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	context = config.getServletContext();
    }
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html");
	
	int empid=Integer.parseInt(request.getParameter("empId"));
	RequestDispatcher dispatcher=null;
	employeeDao=(EmployeeDao)context.getAttribute("employeeDao");
	if(employeeDao.deleteEmployee(empid))
	{	
		response.sendRedirect("getAllEmployees");
	}
	else
	{
		dispatcher = request.getRequestDispatcher("error.jsp");
		dispatcher.forward(request, response);
	}
	
	}

}
