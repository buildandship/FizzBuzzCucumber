package com.pmishra.bddtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;
    @BeforeEach
    void init(){
        fizzBuzz=new FizzBuzz();
    }


    @Test
    void testNumber(){
        String fizzBuzzStr = fizzBuzz.play(1);
        assertEquals(fizzBuzzStr,"1");
    }

    @Test
    void testFizzBuzz(){
        String fizzBuzzStr = fizzBuzz.play(15);
        assertEquals(fizzBuzzStr,"FizzBuzz");
    }


    @AfterEach
    void cleanup(){
        fizzBuzz=null;
    }


}