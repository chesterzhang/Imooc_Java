package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestMethodServlet extends HttpServlet {
	
	 
	//ר�Ŵ���get����
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name"); 
		response.getWriter().println("<h1 style='color:green'>name="+name+"</h1>");
	}

	//ר�Ŵ���post����
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name"); 
		response.getWriter().println("<h1 style='color:red'>name="+name+"</h1>");
	}
}

