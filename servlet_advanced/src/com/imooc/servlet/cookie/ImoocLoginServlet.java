package com.imooc.servlet.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImoocLoginServlet
 */
@WebServlet("/cookies/login")
public class ImoocLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImoocLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("�û���½�ɹ�");
		
		//����һ�� cookie ����,��һ������Ϊcookie����,�ڶ�������Ϊcookie���� 
		Cookie  cookie = new Cookie("user","admin");
		//����cookie �����Ч��,��λΪ��,��������,������ر�,cookie��ʧ
		cookie.setMaxAge(60*60*24*3);
		
		//����cookie�������, �Ժ�ÿһ��request���Ὣcookieһͬ���ͳ�ȥ
		response.addCookie(cookie);
		response.getWriter().println("login success");
	}

}
