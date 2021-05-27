/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Borisyuk.Lab8;

import java.util.Arrays;
import java.util.Random;

public class Algorithms {
    private int[] _array;
    
    public Algorithms(int length)
    {
        _array = GenerateArray(length);
    }
    
    public int[] GenerateArray(int length)
    {
        Random rd = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
           array[i] = rd.nextInt();
        return array;
    }
    
    public AlgorithmDetails InsertionSort()
    {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int substitutions = 0;
        int comparisons = 0;
        long startTime = System.nanoTime();
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            comparisons += 2;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                substitutions++;
            }
            array[j + 1] = key;
            substitutions++;
        }
        comparisons += n;
        long endTime = System.nanoTime();
        details.setComparisons(comparisons);
        details.setSubstitutions(substitutions);
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
    
    public AlgorithmDetails SelecionSort()
    {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int temp = 0;
        int substitutions = array.length-1;
        int comparisons = 0;
        int min_idx = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length-1; i++)
        {
            comparisons++;
            min_idx = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[min_idx])
                    min_idx = j;
                comparisons += 2;
            }
            temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        long endTime = System.nanoTime();
        details.setComparisons(comparisons);
        details.setSubstitutions(substitutions);
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
    
    public AlgorithmDetails bubbleSort() {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int temp = 0;
        int substitutions = 0;
        int comparisons = 0;
        long startTime = System.nanoTime();
        for(int i=0; i < array.length; i++){ 
            comparisons++;
            for(int j=1; j < array.length - i; j++){  
                comparisons += 2;
                if(array[j-1] > array[j]){  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;
                    substitutions++;
                }                
            }  
        }
        long endTime = System.nanoTime();
        details.setComparisons(comparisons);
        details.setSubstitutions(substitutions);
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
}

