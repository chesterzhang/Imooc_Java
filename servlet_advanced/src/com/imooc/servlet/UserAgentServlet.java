package com.imooc.servlet;

//�����ж� ����servlet��agent����

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class UserAgentServlet
 */
@WebServlet("/user-agent" )
public class UserAgentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAgentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���headerд����,http����״̬�� 500, �������ڲ����� 
		String userAgent=request.getHeader("User-Agent");
		
		//ContentType����������������ú��ַ�ʽ����Ӧ����д���
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(userAgent);
		String agentType="";
		if (userAgent.indexOf("Windows")!=-1) {
			agentType="<h1>����Windows PC����ҳ</h1>";
		}else if((userAgent.indexOf("iPhone")!=-1) || (userAgent.indexOf("Android")!=-1 )) {
			agentType="<h1>�����ƶ�����ҳ</h1>";
		}
		response.getWriter().println(agentType);
		
	}

}
