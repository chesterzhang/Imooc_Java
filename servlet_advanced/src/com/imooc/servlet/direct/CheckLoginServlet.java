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
		System.out.println("用户登陆成功");
		
		//给request设置一个属性值
		request.setAttribute("userName", "admin");
		
		//请求转发的功能, 将浏览器请求原封不动的从/direct/check 转发 到/direct/index
		//request.getRequestDispatcher("/direct/index").forward(request, response);
		
		//响应重定向,浏览器发送请求给/direct/check, /direct/check返回一个响应给浏览器
		//浏览器再发一个新请求给/direct/index
		response.sendRedirect("/servlet_advanced/direct/index");
	}

 

}
