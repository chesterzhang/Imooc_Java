package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/unused",loadOnStartup = 200)
public class AnalysisServlet  extends HttpServlet{
	//tomcat启动时加载
			@Override
			public void init() throws ServletException {
				System.out.println("正在分析数据");
			}
	
}
