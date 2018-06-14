<%@ page import="com.CallingClassFromJsp" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.NamesToWeb" %><%--
  Created by IntelliJ IDEA.
  User: Dron
  Date: 13.06.2018
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%  int i=1;
    for (String s : com.CallingClassFromJsp.getArrayStudentName()) {
    out.println("<br/>"+i+" student name ="+s);
    i++;
}%>
</body>
</html>
