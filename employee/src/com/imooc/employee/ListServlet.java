package com.imooc.employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = request.getServletContext();
		
		if (context.getAttribute("employees")==null) {
			List<Employee> list= new ArrayList<Employee>();
			
			list.add(new Employee(7731,"张三","市场部","客户代表",8000f));
			list.add(new Employee(7732,"李四","研发部","工程师",10000f));			
			
			context.setAttribute("employees", list);	
			 
		}
		
		request.getRequestDispatcher("/employee.jsp").forward(request, response);
		
	}

}

