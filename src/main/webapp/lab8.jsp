
<%@page import="TheoryOfAlgorithms.Borisyuk.Lab8.AlgorithmDetails"%>
<%@page import="TheoryOfAlgorithms.Borisyuk.Lab8.Algorithms"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laboratorna 8</title>
    </head>
    <body>
      
        <h2 class="text-left"><b>Постановка задачі:</b> відсортувати масив цілих чисел</h2>
        <p><b>Вихідні дані:</b><br>Кількість елементів: 20000</p>
        <%! Algorithms algorithms = new Algorithms(20000);%>
        <hr>
        <% AlgorithmDetails bubbleSortDetails = algorithms.bubbleSort(); %>
        <p><b>Назва алгоритму: </b>Bubble Sort</p>
        <p><b>Час роботи:</b>  <%= bubbleSortDetails.getTime() %>ms</p>
        <p><b>Кількість порівнянь </b><%= bubbleSortDetails.getComparisons() %></p>
        <p><b>Кількість перестановок </b><%= bubbleSortDetails.getSubstitutions() %></p>
        <p><b>Складність(Big-O): O^2</b></p>
        <hr>
         <% AlgorithmDetails selectionSortDetails = algorithms.SelecionSort(); %>
        <p><b>Назва алгоритму: </b>Selection Sort</p>
        <p><b>Час роботи:</b>  <%= selectionSortDetails.getTime() %>ms</p>
        <p><b>Кількість порівнянь </b><%= selectionSortDetails.getComparisons() %></p>
        <p><b>Кількість перестановок </b><%= selectionSortDetails.getSubstitutions() %></p>
        <p><b>Складність(Big-O): O^2</b></p>
        <hr>
        <% AlgorithmDetails insertionSortDetails = algorithms.InsertionSort(); %>
        <p><b>Назва алгоритму: </b>Insertion Sort</p>
        <p><b>Час роботи:</b>  <%= insertionSortDetails.getTime() %>ms</p>
        <p><b>Кількість порівнянь </b><%= insertionSortDetails.getComparisons() %></p>
        <p><b>Кількість перестановок </b><%= insertionSortDetails.getSubstitutions() %></p>
        <p><b>Складність(Big-O): O^2</b></p>
    </body>
</html>
