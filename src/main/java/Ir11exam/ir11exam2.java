/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ir11exam;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class ir11exam2 {
    public List<Double> args;
    public static List<Double> results;
    
    public ir11exam2 (){
        args = new LinkedList<Double>();
        results = new LinkedList<Double>();
    }
    
    public ir11exam2 (int length)
    {
        args = new LinkedList<Double>();
        results = new LinkedList<Double>();
        Random random = new Random();
        
        for (int i = 0; i < length; i++)
            args.add((double)random.nextInt(100));
    }
    
    public void SetArgs(double[] args)
    {
        this.args.clear();
        for (int i = 0; i < args.length; i++)
            this.args.add(args[i]);
    }
    
    public String Calculate()
    {
        results.clear();
        int length = args.size();

        for (int i = 0; i < length; i++)
            results.add(Double.parseDouble(ir11exam1.Calculate(args.get(i))));
        
        return results.toString();
    }
    
    public String GetArgs()
    {
        return args.toString();
    }
    
    public static int SearchResult(double value)
    {
        int length = results.size();
        for (int i = 0; i < length; i++)
            if(results.get(i) == value)
                return i + 1;
        
        return -1;
    }
    
       public static String Sort(boolean asc)
    {
        int length = results.size(); 
        double temp = 0;
        for (int i = 0; i < length - 1; i++){
            for (int j = 0; j < length - i - 1; j++){
                if(asc)
                {
                    if (results.get(j) > results.get(j + 1))
                    {
                        temp = results.get(j);
                        results.set(j, results.get(j+1));
                        results.set(j + 1, temp);
                    }
                }
                else
                {
                    if (results.get(j) < results.get(j + 1))
                    {
                        temp = results.get(j);
                        results.set(j, results.get(j+1));
                        results.set(j + 1, temp);
                    }
                }
            }
        }
        
        return results.toString();
    }
    
}
