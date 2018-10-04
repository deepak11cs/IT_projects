<%-- 
    Document   : Operate
    Created on : 4 Oct, 2018, 8:57:27 PM
    Author     : dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <c:set var="a" value="${param.num1}"/>
        <c:set var="b" value="${param.num2}"/>
        <c:set var="c" value="${param.radio}"/>
        <c:if test="${c=="sub"}">
            Result : ${a-b}
        </c:if>
        <c:if test="${c=="mul"}">
            Result : ${a*b}
        </c:if>
        <c:if test="${c=="add"}">
            Result : ${a+b}
        </c:if>
    </body>
</html>
