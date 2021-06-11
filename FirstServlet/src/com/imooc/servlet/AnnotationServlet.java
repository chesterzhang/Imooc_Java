package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

//Annotation ����, ���ڼ�webӦ�ó�������ù���
@WebServlet("/anno")
public class AnnotationServlet extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("I am annotation servlet !");
	}

	
}

