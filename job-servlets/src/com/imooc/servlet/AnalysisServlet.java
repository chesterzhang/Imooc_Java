package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/unused",loadOnStartup = 200)
public class AnalysisServlet  extends HttpServlet{
	//tomcat����ʱ����
			@Override
			public void init() throws ServletException {
				System.out.println("���ڷ�������");
			}
	
}
