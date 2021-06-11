package com.imooc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContentTypeServlet
 */
@WebServlet("/content-type")
public class ContentTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContentTypeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String output="<h1><a href='http://www.baidu.com'>百度</a></h1>";
		 //设置不同的ContentType
		 response.setContentType("text/html;charset=utf-8");
		 response.setContentType("text/plain;charset=utf-8");
		 response.setContentType("application/x-msdownload;charset=utf-8");
		 response.getWriter().println(output);
	}

}
