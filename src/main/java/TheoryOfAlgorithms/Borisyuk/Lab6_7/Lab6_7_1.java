/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Borisyuk.Lab6_7;

public class Lab6_7_1 {
    private String _digits;
    private int _digitsNumber;
    
    public Lab6_7_1(int number)
    {
        _digits = Integer.toString(number);
        _digitsNumber = _digits.length();
    }
    
    public int Count(int i, int counter, char symbol)
    {
        if(i == _digitsNumber)
            return counter;
        if(_digits.charAt(i) == symbol)
            counter++;
        counter = Count(i + 1, counter, symbol);
        return counter;
    }
}
