package com.imooc.servlet;

//用来判断 访问servlet的agent种类

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
		//如果header写错了,http返回状态是 500, 服务器内部错误 
		String userAgent=request.getHeader("User-Agent");
		
		//ContentType决定了浏览器将采用何种方式对响应体进行处理
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println(userAgent);
		String agentType="";
		if (userAgent.indexOf("Windows")!=-1) {
			agentType="<h1>这是Windows PC端首页</h1>";
		}else if((userAgent.indexOf("iPhone")!=-1) || (userAgent.indexOf("Android")!=-1 )) {
			agentType="<h1>这是移动端首页</h1>";
		}
		response.getWriter().println(agentType);
		
	}

}
