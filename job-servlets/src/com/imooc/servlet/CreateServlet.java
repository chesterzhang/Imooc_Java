package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class CreateServlet extends HttpServlet{

	//tomcat����ʱ����
	@Override
	public void init() throws ServletException {
		System.out.println("���ڼ������ݿ�");
	}

	
}
