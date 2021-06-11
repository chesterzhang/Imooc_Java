<%@page import="java.util.Date"%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"   prefix="fmt"   %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"   %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

        <%
            request.setAttribute("amt", 123456.789);
            request.setAttribute("now", new Date());
            request.setAttribute("html", "<a href='index.html'>index</a>");
            request.setAttribute("nothing", null);
        %>
        
        <h2>${now }</h2>        
        <!--  fmt 时间格式化标签 -->
        <!-- 
                formatDate pattern
                yyyy     年
                MM      月
                dd        日
                HH       24小时
                hh        12小时
                mm      分钟
                ss         秒数
                SSS      毫秒    
         -->
        <h2>
                <fmt:formatDate value="${requestScope.now}"  pattern="yyyy年MM月dd日HH时mm分ss秒SSS毫秒"/>
        </h2>
        
        <h2>${amt }</h2>
        <!--  fmt 数字格式化标签, 几位一分隔, 保留几位小数 -->
        <h2>
                <fmt:formatNumber value="${requestScope.amt}"  pattern="0,000.00"/>
        </h2>
        
        <!-- 为null设置默认值 -->
        <h2>null默认值: <c:out value="${nothing}"   default="无"> </c:out> </h2>
        
        <!-- 将HTML标签设置为转义字符串 -->
        <h2> <c:out value="${html}"   escapeXml="true"> </c:out> </h2>

</body>
</html>


