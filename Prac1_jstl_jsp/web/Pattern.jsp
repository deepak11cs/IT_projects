<%-- 
    Document   : Pattern
    Created on : 4 Oct, 2018, 8:28:27 PM
    Author     : dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pattern</title>
    </head>
    <body>
        <c:forEach var="a" begin="1" end="${param.num}" step="1">
            <c:forEach var="b" begin="1" end="${a}" step="1">
                <c:out value="${b}"/>
            </c:forEach><br>
        </c:forEach>
    </body>
</html>
