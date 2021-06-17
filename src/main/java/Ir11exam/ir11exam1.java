/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ir11exam;

/**
 *
 * @author Admin
 */
public class ir11exam1 {
    
   public static String Calculate(double x)
    {
        if ((11*x-5)==0)
            return "Division by zero";
        return Double.toString(2/(11*x-5));
    }
}
    

