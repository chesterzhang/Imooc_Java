package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestMethodServlet extends HttpServlet {
	
	 
	//专门处理get请求
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name"); 
		response.getWriter().println("<h1 style='color:green'>name="+name+"</h1>");
	}

	//专门处理post请求
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name"); 
		response.getWriter().println("<h1 style='color:red'>name="+name+"</h1>");
	}
}

