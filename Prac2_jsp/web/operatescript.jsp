<%-- 
    Document   : operatescript
    Created on : 13 Oct, 2018, 12:30:20 PM
    Author     : dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>using scriptlet</title>
    </head>
    <body>
        <%
            int a=Integer.parseInt(request.getParameter("num1"));
            int b=Integer.parseInt(request.getParameter("num2"));
            String s=request.getParameter("radio");
            int c;
            if(s.equals("sub")){
                c=a-b;
            }
            else if(s.equals("add")){
                c=a+b;
            }
            else{
                c=a*b;
            }
            out.println("Result = "+c);
        %>
        
    </body>
</html>
