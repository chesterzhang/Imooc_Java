<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

        <!-- EL 表达式 -->
        
        <!--  request 作用范围,在servlet中用request.setAttribute() -->
        <h1>姓名: ${requestScope.student.name }</h1>
        <h2>手机: ${requestScope.student.mobile }</h2>
        <h2>评级: ${requestScope.grade }</h2>
        <!-- param为el内置对象,能够直接获取request的参数 , 本质上是request.getParam-->
        <h2>老师: ${param.teacher }</h2>
        <h2>概要: ${requestScope.student }</h2>
        
        <!--  session 作用范围,在servlet中用session.setAttribute() -->
        <h1>姓名: ${sessionScope.student.name }</h1>
        <h2>手机: ${sessionScope.student.mobile }</h2>
        <h2>评级: ${sessionScope.grade }</h2>
        <!-- param为el内置对象,能够直接获取request的参数 -->
        <h2>老师: ${param.teacher }</h2>
        <h2>评级: ${sessionScope.student }</h2>
        
        <!-- 也可以忽略作用域, el按照从小到大尝试获取,pageScope, requestScope, sessionScope, applicationScope -->
        
</body>
</html>



