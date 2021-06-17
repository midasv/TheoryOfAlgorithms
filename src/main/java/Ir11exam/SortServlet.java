/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ir11exam;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ваня
 */
@WebServlet(name = "SortServlet", urlPatterns = {"/sortMode"})
public class SortServlet extends HttpServlet {

 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String mode = request.getParameter("mode");
        if(mode.equals("asc") || mode.equals("desc")){
            String sortedResults = ir11exam2.Sort(mode.equals("asc"));
            request.setAttribute("sortedResults", sortedResults);
        }
        else
            request.setAttribute("sortedResults", "Unknown sorting mode");
        request.getRequestDispatcher("exam.jsp").forward(request, response);
    }
}
