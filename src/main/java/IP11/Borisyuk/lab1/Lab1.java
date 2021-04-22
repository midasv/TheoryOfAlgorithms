/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IP11.Borisyuk.lab1;

/**
 *
 * @author V
 */
public class Lab1 {
     private int _score;
    
    public Lab1(){
        _score = 20;
    }
    
    public Lab1(int score){
        _score = score;
    }

    public int getScore() {
        return _score;
    }

    public void setScore(int score) {
        _score = score;
    }

    @Override
    public String toString() {
        return "Score = " + _score;
    }
    
    public void MoreScore(int value)
    {
        _score += value;
    }
    
     public void LessScore(int value)
    {
        _score -= value;
    }
}
