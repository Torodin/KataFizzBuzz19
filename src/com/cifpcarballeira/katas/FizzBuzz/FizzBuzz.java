/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author daw110
 */
public class FizzBuzz {
    public String getFizzBuzz(int num){
        if(num%3 == 0 && num%5 == 0) return "FizzBuzz";
        //else if((num%10 == 3 || num%10 == 5) && (num%3 == 0 || num%5 == 0)) return "";
        else if(num%3 == 0 || num-num%10 == 3 || num%10 == 3) return "Fizz";
        else if(num%5 == 0) return "Buzz";
        return num+"";
    }
}
