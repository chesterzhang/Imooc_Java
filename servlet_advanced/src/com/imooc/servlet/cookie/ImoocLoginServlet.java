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
		System.out.println("用户登陆成功");
		
		//创建一个 cookie 对象,第一个参数为cookie名称,第二个参数为cookie数据 
		Cookie  cookie = new Cookie("user","admin");
		//设置cookie 最大有效期,单位为秒,若不设置,浏览器关闭,cookie消失
		cookie.setMaxAge(60*60*24*3);
		
		//保存cookie到浏览器, 以后每一次request都会将cookie一同发送出去
		response.addCookie(cookie);
		response.getWriter().println("login success");
	}

}
