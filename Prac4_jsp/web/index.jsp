<%-- 
    Document   : index
    Created on : 4 Oct, 2018, 10:59:02 PM
    Author     : dev
--%>


<%@taglib prefix="a" uri="/WEB-INF/tlds/mygreettag.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello</title>
    </head>
    <body>
        <form action="index.jsp">
            <input name="name" type="text" required="required">
            <input type="submit">
        </form>
                       
        <%
            String s=request.getParameter("name");
            if(s!=null){
                pageContext.setAttribute("nm",s);
            }
           
        %>
        <c:if test="${nm!=null}">
            <a:uname name="${nm}"/>
        </c:if>
        

    </body>
</html>
