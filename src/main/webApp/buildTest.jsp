<%--
  Created by IntelliJ IDEA.
  User: Dron
  Date: 10.06.2018
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>JSp build</h2>
Request user agent: <%=request.getHeader("User-Agent")%>
<br><br>
Request language: <%=request.getLocale()%>
<jsp:include page="mypage.jsp"/>
</body>
</html>
