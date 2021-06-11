package com.imooc.servlet.pattern;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//用来处理URL匹配
public class PatternServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取当前访问的URL
		String url = request.getRequestURI().toString();
		System.out.println(url);
		
		//获取员工ID,并打印出来
		String id=url.substring(url.lastIndexOf("/")+1);
		int numId=Integer.parseInt(id);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println(id);
		if (numId==1) {
			out.println("张三");
		}else if (numId==2) {
			out.println("李四");
		}else if (numId==3){
			out.println("王二麻子");
		}else {
			out.println("其他员工");
		}
	}
	
	

}
