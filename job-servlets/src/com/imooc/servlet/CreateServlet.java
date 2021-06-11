package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class CreateServlet extends HttpServlet{

	//tomcat启动时加载
	@Override
	public void init() throws ServletException {
		System.out.println("正在加载数据库");
	}

	
}
