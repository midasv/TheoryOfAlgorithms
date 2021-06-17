
<%@page import="TheoryOfAlgorithms.Borisyuk.Lab6_7.BinaryTreePrinter"%>
<%@page import="TheoryOfAlgorithms.Borisyuk.Lab6_7.BinaryTree"%>
<%@page import="TheoryOfAlgorithms.Borisyuk.Lab6_7.Lab6_7_1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laboratorna 6-7</title>
    </head>
    <body>
       
        <%! Lab6_7_1 lab6_7_1 = new Lab6_7_1(585625);%>
        <p>Number 585625<br> Amount of 5: <%= lab6_7_1.Count(0, 0, '5')%></p>
        <%! BinaryTree tree = new BinaryTree();%>
        <%
            tree.add(16);
            tree.add(5);
            tree.add(2);
            tree.add(11);
            tree.add(3);
            tree.add(15);
            tree.add(1);
            tree.add(14);
        %>
        <pre>
        <p>Result:<br> <%= BinaryTreePrinter.printNode(tree.getRoot())%></p>
        </pre>
        <%tree.mirrorTree(tree.getRoot()); %>
        <pre>
        <p>Result:<br> <%= BinaryTreePrinter.printNode(tree.getRoot())%></p>
        </pre>
    </body>
</html>
