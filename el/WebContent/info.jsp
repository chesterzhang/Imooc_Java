<%@page import="com.imooc.el.Student"%>
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
            Student stu= (Student)request.getAttribute("student");
            String grade=(String)request.getAttribute("grade");
            out.println("<h1>姓名: "+stu.getName()+"</h1>");
            out.println("<h2>手机: "+stu.getMobile()+"</h2>");
            out.println("<h2>评分: "+grade+"</h2>");
        %>

</body>
</html>
