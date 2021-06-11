package com.imooc.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionIndexServlet
 */
@WebServlet("/session/index")
public class SessionIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionIndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取Session 对象, 默认在服务器中存在30分钟
		HttpSession session= request.getSession();
		String name= (String) session.getAttribute("user");
		
		//打印SessionId
		String sessionId=session.getId();
		System.out.println("session id为: "+sessionId);
		
		//打印session属性, 由于有中文,需用设置response.setContentType()
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("这是首页, 当前用户为:"+ name);
	}

}
