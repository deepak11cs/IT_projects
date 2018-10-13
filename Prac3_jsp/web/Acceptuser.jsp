<%-- 
    Document   : Acceptuser
    Created on : 4 Oct, 2018, 9:38:55 PM
    Author     : dev
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validate user</title>
    </head>
    <body>
        <c:set var="a" value="${param.name}"/>
        <c:set var="b" value="${param.dob}"/>
        <c:set var="c" value="${param.email}"/>
        <c:set var="d" value="${param.lucky}"/>
        <c:set var="e" value="${param.food}"/>
        <c:if test="${a!="" && b!="" && c!="" && d!="" && e!=""}">
            <jsp:forward page="welcome.html"/>
        </c:if>
        <h6 style="color: red"><center>*All fields are compulsory</center></h6>
        <jsp:include page="index.html"/>
    </body>
</html>
