package com.imooc.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionLoginServlet
 */
@WebServlet("/session/login")
public class SessionLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("�û���½�ɹ�");
		
		//��ȡSession ����
		HttpSession session= request.getSession();
		
		//session��������������ڹرն���ʧ
		
		//��session������������
		session.setAttribute("user", "����");
		
		//��ӡSessionId
		String sessionId=session.getId();
		System.out.println("session idΪ: "+sessionId);
		
		//����ת��
		request.getRequestDispatcher("/session/index").forward(request, response);
		
	}

}



