package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {
	
	//service 是一个处理请求的核心方法,无论是get还是post, 都会被service()方法处理
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取单个请求参数
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile");
		String gender=request.getParameter("gender");
		
		//获取多个同名的请求参数列表,通常用于复选框
		String[] hobbies= request.getParameterValues("hobby");
		
		
		PrintWriter out= response.getWriter();//向浏览器返回的输出数据流, 这一句写法固定写死
		out.print("<h1>name="+name+"</h1>");
		out.print("<h1>mobile="+mobile+"</h1>");
		out.print("<h1>gender="+gender+"</h1>");
		for(String hobby: hobbies) {
			out.print("<h1>hobby="+hobby+"</h1>");
		}
		
		//获取请求方式, get还是post
		String method =request.getMethod();
		out.print("<h1>method="+method+"</h1>");
		out.print("<a href='http://www.baidu.com'>Baidu</a>");
		
		
	}

}



