package com.imooc.servlet.direct;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckLoginServlet
 */
@WebServlet("/direct/check")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("�û���½�ɹ�");
		
		//��request����һ������ֵ
		request.setAttribute("userName", "admin");
		
		//����ת���Ĺ���, �����������ԭ�ⲻ���Ĵ�/direct/check ת�� ��/direct/index
		//request.getRequestDispatcher("/direct/index").forward(request, response);
		
		//��Ӧ�ض���,��������������/direct/check, /direct/check����һ����Ӧ�������
		//������ٷ�һ���������/direct/index
		response.sendRedirect("/servlet_advanced/direct/index");
	}

 

}
