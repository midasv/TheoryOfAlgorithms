/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP11lab2;

/**
 *
 * @author V
 */
public class lab2Validator {
    private lab222 calculator;
    
    public lab2Validator()
    {
        calculator = new lab222();
    }
    
    public String ValidateAndCalculate(String arg)
    {
        try{
            float x = Float.parseFloat(arg);
            if(x < 0)
                return "Argumnet not in the domain of expression";
            Float result = calculator.CalculateFormula(x);
            return result == Float.MAX_VALUE ? "Division by 0" : result.toString();
        }
        catch(Exception e)
        {
            return "Argumant is not a number";
        }
    }
}