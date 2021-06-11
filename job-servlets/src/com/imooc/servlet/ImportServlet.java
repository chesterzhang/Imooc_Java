package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class ImportServlet extends HttpServlet {
	
		//tomcat启动时加载
		@Override
		public void init() throws ServletException {
			System.out.println("正在导入数据");
		}
	
}
