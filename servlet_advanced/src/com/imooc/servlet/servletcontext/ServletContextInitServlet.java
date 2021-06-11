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
		//获取 ServletContext
		//ServletContext是Web应用全局对象, 一个web只会创建一个ServletContext
		//ServletContext随着web应用启动而自动创建
		ServletContext context =request.getServletContext();
		
		//设置多个属性
		//context.setAttribute("copyright", "@2021 imoo.com 京ICP备 12003892号");
		//context.setAttribute("title", "慕课网-程序员的梦工厂");
		
		//更推荐在web.xml里面设置和获取context
		String copytright=context.getInitParameter("copyright");
		String title=context.getInitParameter("title");
		context.setAttribute("copyright",copytright);
		context.setAttribute("title",title);
		
		response.getWriter().println("init success");
	}

}
