<!-- jsp 本质上是利用Java写HTML, 简化前端开发 -->
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table>
        <tr>
        	<th>year</th>
		<th>salary</th>
        </tr> 
        
        <%
        for( int i=0; i<=50; i++){
        	out.println("<tr>");
        	out.println("<td>"+i+"</td>");
        	int sla=0;//薪水
        	if(i<=5){
        		sla+=1500+i*150;
        	}else if(i<=10){
        		sla+=1500+5*150+300*(i-5);
        	}else{
        		sla+=1500+5*150+300*5+375*(i-10);
        	}
        	out.println("<td>"+sla+"</td>");
        	out.println("</tr>");
        }     
        %>
  
    </table>

</body>
</html>