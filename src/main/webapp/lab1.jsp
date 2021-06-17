<%-- 
    Document   : lab1
    Created on : 32 апр. 2021 г., 15:50:47
    Author     : Ваня
--%>


<%@page import="IP11.Borisyuk.lab1.Lab1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
          <%! Lab1 lab1 = new Lab1();%>
                <p>Initial value: <%= lab1.toString()%></p>
                <%lab1.MoreScore(10);%>
                <p>Value more by 10: <%= lab1.toString()%></p>
                <%lab1.LessScore(40);%>
                <p>Value less by 40: <%= lab1.toString()%></p>
    </body>
</html>
