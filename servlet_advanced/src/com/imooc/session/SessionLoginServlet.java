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
		System.out.println("用户登陆成功");
		
		//获取Session 对象
		HttpSession session= request.getSession();
		
		//session对象随浏览器窗口关闭而消失
		
		//对session对象设置属性
		session.setAttribute("user", "张三");
		
		//打印SessionId
		String sessionId=session.getId();
		System.out.println("session id为: "+sessionId);
		
		//请求转发
		request.getRequestDispatcher("/session/index").forward(request, response);
		
	}

}



