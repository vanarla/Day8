package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/currencyconverter")
public class CurrencyConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CurrencyConverterServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		PrintWriter out=response.getWriter();
		
		out.println("<style> table,th,td { border: 1px solid black;  border-collapse:collapse;  } th,td {padding: 10px; } </style>");
		out.println("<table>  <tr> <th> US Dollar</th> <th>Indian Rupees</th> </tr>");
		for(int i=1;i<=50;i++)
		{
			//double dollar=i*45;
			out.println("<tr>  <td>"+i+"</td>  <td>"+i*45+"</td></tr>");
		}
		out.println("</table>");		
		out.close();
		
		
	}

}
