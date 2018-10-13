<%-- 
    Document   : choose
    Created on : 13 Oct, 2018, 12:46:26 PM
    Author     : dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input</title>
    </head>
    <body>
        <c:set var="a"  value="${param.radio}"/>
        <c:if test="${a=="el"}">
        <form action="Operate.jsp" method="POST">
        </c:if>
        <c:if test="${a=="gp"}">
        <form action="operatescript.jsp" method="POST">
        </c:if>
            <input type="number" name="num1">
            <input type="number" name="num2"><br>
            Add: <input type="radio" name="radio" value="add">
            Subtract: <input type="radio" name="radio" value="sub">
            Multiply: <input type="radio" name="radio" value="mul">
            <input type="submit" value="calculate">
        </form>
    </body>
</html>
