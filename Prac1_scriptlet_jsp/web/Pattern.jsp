<%-- 
    Document   : Pattern
    Created on : 3 Oct, 2018, 10:28:42 PM
    Author     : dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pattern</title>
    </head>
    <body>
        <%
            String b=request.getParameter("num");
            int x=Integer.parseInt(b);
            for(int i=0;i<x;++i){
                for(int j=0;j<=i;++j){
                    out.print((j+1)+" ");
                }
                out.println("<br>");
            }
        %>
    </body>
</html>
