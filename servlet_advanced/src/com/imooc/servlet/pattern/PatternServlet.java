package com.imooc.servlet.pattern;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//��������URLƥ��
public class PatternServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ��ǰ���ʵ�URL
		String url = request.getRequestURI().toString();
		System.out.println(url);
		
		//��ȡԱ��ID,����ӡ����
		String id=url.substring(url.lastIndexOf("/")+1);
		int numId=Integer.parseInt(id);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println(id);
		if (numId==1) {
			out.println("����");
		}else if (numId==2) {
			out.println("����");
		}else if (numId==3){
			out.println("��������");
		}else {
			out.println("����Ա��");
		}
	}
	
	

}
