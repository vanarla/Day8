package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.domain.Employee;


@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private ArrayList<Employee> emp=new ArrayList<>();
    
   
    @Override
    public void init() throws ServletException {
    	
    	emp.add(new Employee(100,"John",25000.0,"Java"));
    	emp.add(new Employee(124,"Edward",15000.0,"C"));
    	emp.add(new Employee(107,"Josh",75000.0,"C++"));
    	emp.add(new Employee(123,"Peter",35000.0,"Python"));
    	emp.add(new Employee(189,"Lara",12000.0,".NET"));
    	
    }
    
    public EmployeeServlet() {
        super();
            }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 
	 String empid=request.getParameter("empnumber");
	 int empnum=Integer.parseInt(empid);
	 
	 int count=0;
 for (Employee e : emp) {
		 if(e.getEmpId()==empnum)
		 {
			 count=1;
			 out.println("<style> table,th,td { border: 1px solid black;  border-collapse:collapse;  } th,td {padding: 10px; } </style>");
			 out.println("<table> <tr> <th>Employee Id</th> <th>Employee Name</th> <th>Employee Salary</th><th>Name of the Department</th></tr>");
			 out.println("<tr> <td>"+e.getEmpId()+"</td> <td>"+e.getEmpName()+"</td> <td>"+e.getSalary()+"</td> <td>"+e.getNameOfDept()+"</td></tr>");
			 out.println("</table>");
		 }
		 
		
	}
 if(count==0)
 {
 
	out.println("<h3>Id not found</h3>");
 }
	out.close();
	
	}

}
