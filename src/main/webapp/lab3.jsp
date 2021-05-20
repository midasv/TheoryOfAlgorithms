<%-- 
    Document   : lab3
    Created on : 32 мая 2021 г., 16:39:06
    Author     : Ваня
--%>

<%@page import="lab3.calculator"%>
<%@page import="lab3.calculator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! calculator calculator = new calculator();%>
                <%calculator.InitArray(20);%>
                <p>Array: <%= calculator.DisplayArray()%></p>
                <p>Result: <%= calculator.proccesArray()%></p>
    </body>
</html>
