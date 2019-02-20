package com.cifpcarballeira.katas.FizzBuzz.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daw110
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }
    
    @Test
    public void test1devuelve1(){
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(1);
        assertEquals("1", resultado);
    }
    
    @Test
    public void test2devuelve2(){
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(2);
        assertEquals("2", resultado);
    }
    
    @Test
    public void test3devuelveFizz(){
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(3);
        assertEquals("Fizz", resultado);
    }
    
    @Test
    public void test15devuelveFizzBuzz(){
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(15);
        assertEquals("FizzBuzz", resultado);
    }
    
    public void testContiene3(){
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(13);
        assertEquals("Fizz", resultado);
    }
}
