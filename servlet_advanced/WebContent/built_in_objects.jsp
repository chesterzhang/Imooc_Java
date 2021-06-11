<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <%
 
            //jsp内置对象
            String url=request.getRequestURL().toString();
        
            response.getWriter().println(url);
           //out 就等于response.getWriter()
            out.println("<br>");
        
        %>
        
        <%
            session.setAttribute("user", "张三");          
            out.println((String)session.getAttribute("user"));
            out.println("<br>");
        %>
        
        
        <%
            String copyright=application.getInitParameter("copyright"); //application就是ServletContext
            out.println(copyright);
        %>
        
        <%
            pageContext.getRequest();
            pageContext.getResponse();
            pageContext.getSession();
            pageContext.getServletContext();
        %>
        
        
</body>
</html>
