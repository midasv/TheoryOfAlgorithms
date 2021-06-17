<%-- 
    Document   : lab1
    Created on : 32 апр. 2021 г., 15:50:47
    Author     : Ваня
--%>


<%@page import="IP11lab2.lab222"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
           <form action="./lab2" method="post" class="form-inline">
                    <label for="x">Enter x</label>
                    <div class="input-group">
                        <input  class="form-control" id="x" type="text" name="x" placeholder="##.###"/>
                        <input class="btn btn-success" type="submit" value="Submit"/>
                    </div>
                    <p class="mt-3 mb-0">Result: <%=request.getAttribute("result")%></p>
                </form>
               
    </body>
</html>
