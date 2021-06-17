<%-- 
    Document   : index
    Created on : 16.06.2021, 19:12:58
    Author     : Admin
--%>

<%@page import="Ir11exam.ir11exam2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam</title>
    </head>
    <body>
        <form action="./formula" method="post" class="form-inline">
            <label for="x"><b>Enter x:</b></label>
            <div class="input-group">
                <input  class="form-control" id="x" type="text" name="x"/>
                <input class="btn btn-success" type="submit" value="Submit"/>
            </div>
            <p class="mt-3 mb-0"><b></b><%=request.getAttribute("result")%></p>
        </form>
        <%! ir11exam2 fr = new ir11exam2(54); %>
        <p>Args: <%= fr.GetArgs()%> </p>
        <p>Results:<%= fr.Calculate() %></p>
        <form action="./searching" method="post" class="form-inline">
            <label for="x"><b>Enter result:</b></label>
            <div class="input-group">
                <input  class="form-control" id="value" type="text" name="value"/>
                <input class="btn btn-success" type="submit" value="Submit"/>
            </div>
            <p class="mt-3 mb-0"><b>Index:</b><%=request.getAttribute("index")%></p>
        </form>
        <form action="./sortMode" method="post" class="form-inline">
            <label for="x"><b>Enter sorting mode:</b></label>
            <div class="input-group">
                <input  class="form-control" id="mode" type="text" name="mode"/>
                <input class="btn btn-success" type="submit" value="Submit"/>
            </div>
            <p class="mt-3 mb-0"><b>Sorted results:</b><%=request.getAttribute("sortedResults")%></p>
        </form>
    </body>
</html>
