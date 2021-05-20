/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Arrays;
import java.util.Random;
/**
 
 * @author Ваня
 */
public class calculator {
    
    private int lowerBorder;
    private int upperBorder;
   
    private int[] array;
    
    public calculator()
    {
        
        lowerBorder = 1;
      
        
        
    }
    
    public calculator(int[] arr)
    {
        array = arr;
    }
    
    public void InitArray(int k)
    {
        array = new int [k];
        upperBorder = k;
        Random rd = new Random();
        for (int i = 0; i < array.length; i++)
           array[i] = rd.nextInt(upperBorder + 1)+lowerBorder;
    }
    
   public int proccesArray()
   {
       int count = 0;
       double  variable;
       for (int i = 0; i < array.length; i++)
       {
          variable = Math.sqrt(array[i]);
          if ((variable == Math.floor(variable)) && !Double.isInfinite(variable)){
              count++;
            }
          
           
       
       }
       return count;
   }    
   
    public String DisplayArray()
    {
        return Arrays.toString(array);
    }
}
