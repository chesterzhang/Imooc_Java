package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {
	
	//service ��һ����������ĺ��ķ���,������get����post, ���ᱻservice()��������
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�����������
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile");
		String gender=request.getParameter("gender");
		
		//��ȡ���ͬ������������б�,ͨ�����ڸ�ѡ��
		String[] hobbies= request.getParameterValues("hobby");
		
		
		PrintWriter out= response.getWriter();//����������ص����������, ��һ��д���̶�д��
		out.print("<h1>name="+name+"</h1>");
		out.print("<h1>mobile="+mobile+"</h1>");
		out.print("<h1>gender="+gender+"</h1>");
		for(String hobby: hobbies) {
			out.print("<h1>hobby="+hobby+"</h1>");
		}
		
		//��ȡ����ʽ, get����post
		String method =request.getMethod();
		out.print("<h1>method="+method+"</h1>");
		out.print("<a href='http://www.baidu.com'>Baidu</a>");
		
		
	}

}



