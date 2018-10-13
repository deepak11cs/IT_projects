<%-- 
    Document   : reverse
    Created on : 13 Oct, 2018, 12:14:26 PM
    Author     : dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="a" uri="/WEB-INF/tlds/myreversetag.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reverse</title>
    </head>
    <body>
        <a:reverse input="${param.n1}"/>
    </body>
</html>
