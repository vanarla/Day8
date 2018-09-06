package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/creditcard")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public CreditCardServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String un=request.getParameter("username");
		String no=request.getParameter("number");
		int num=Integer.parseInt(no);
		String mon=request.getParameter("mnth");
		int month=Integer.parseInt(mon);		
		String yer=request.getParameter("yr");
		int year=Integer.parseInt(yer);
		 
		out.println("<h2>Credit Card Details</h2><hr>");
		out.println("<br>User Name:"+un+"<br><br> CVV Number:"+num+"<br><br>Expiry Date:"+month+"/"+year);
		
		
		out.close();
	}
	

}
