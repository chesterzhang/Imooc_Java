package com.imooc.servlet.servletcontext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextInitServlet
 */
@WebServlet("/servlet-context/init")
public class ServletContextInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextInitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ ServletContext
		//ServletContext��WebӦ��ȫ�ֶ���, һ��webֻ�ᴴ��һ��ServletContext
		//ServletContext����webӦ���������Զ�����
		ServletContext context =request.getServletContext();
		
		//���ö������
		//context.setAttribute("copyright", "@2021 imoo.com ��ICP�� 12003892��");
		//context.setAttribute("title", "Ľ����-����Ա���ι���");
		
		//���Ƽ���web.xml�������úͻ�ȡcontext
		String copytright=context.getInitParameter("copyright");
		String title=context.getInitParameter("title");
		context.setAttribute("copyright",copytright);
		context.setAttribute("title",title);
		
		response.getWriter().println("init success");
	}

}
