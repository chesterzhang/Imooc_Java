package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet  extends HttpServlet{
	
	public FirstServlet() {
		System.out.println("正在创建FirstServlet对象");
	} 
	
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("正在初始化FirstServlet对象");
	}



	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接受请求发来的参数
		String name=request.getParameter("name");
		
		String html="<h1 style ='color:red'>hi, "+name+"! <h1><hr/>";
		System.out.println("返回给浏览器的响应数据为:"+html);
		
		//服务器向浏览器返回的输出流
		PrintWriter out = response.getWriter();
		out.println(html);//将html发送回浏览器
	}


	@Override
	public void destroy() {
		System.out.println("正在销毁FirstServlet对象");
	}
	
}
