<%-- 
    Document   : index
    Created on : 4 Oct, 2018, 10:59:02 PM
    Author     : dev
--%>


<%@page import="org.apache.tomcat.jni.Time"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello</title>
    </head>
    <body>
        <%
            SimpleDateFormat formatter=new SimpleDateFormat("HH:mm:ss");
            Date d=new Date();
            String s=formatter.format(d);
            //out.println(formatter.format(d));
            String ar[]=s.split(":");
            int h=Integer.parseInt(ar[0]);
            if(h>=5 && h<12){
                out.println("good morning");
            }
            else if(h>=12 && h<17){
                out.println("good afternoon");
            }
            else if(h>=17 && h<=21){
                out.println("good evening");
            }
            else{
                out.println("good night");
            }
        %>
    </body>
</html>
