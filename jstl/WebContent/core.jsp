<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"   %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
         <h1>${requestScope.score }</h1>
         <h1>${requestScope.grade }</h1>
         
         <!-- jstl  if 标签与EL表达式一起使用 -->
         <c:if test="${score>=60 }">     
                <h2 style="color:green">恭喜你, 通过测试</h1>
         </c:if>    
         <c:if test="${score<60 }">
                <h2 style="color:red">对不起, 再接再厉</h1>    
         </c:if>      
         
         
         <!-- jstl  choose when otherwise 标签与EL表达式一起使用 -->
         <c:choose>
                <c:when test="${grade=='A' }">
                        <h2 >你很优秀</h1>    
                </c:when>
                <c:when test="${grade=='B' }">
                        <h2 >你还可以</h1>    
                </c:when>     
                <c:otherwise>
                        <h2 >继续努力</h1>    
                </c:otherwise>              
         </c:choose>
         
         <!-- jstl for each 遍历集合 -->
         <c:forEach items="${requestScope.companies}"  var="c"  varStatus="idx">
                <h2>${idx.index} ${c.cname}  ${c.url }</h2>         
         </c:forEach>
            
</body>
</html>

