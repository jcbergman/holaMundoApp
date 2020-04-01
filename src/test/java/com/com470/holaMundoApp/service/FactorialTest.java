package com.com470.holaMundoApp.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    private Factorial factorial;
    @Before
    public void setUp() {
        factorial = new Factorial();
    }
    @After
    public void tearDown() {
        factorial = null;
    }
    @Test
    public void testCalculaFactorial() {
        //when
        long factorialCero = factorial.calculaFactorial(0);
        long factorialUno = factorial.calculaFactorial(1);
        long factorialCinco = factorial.calculaFactorial(5);
        //then
        assertEquals(1, factorialCero);
        assertEquals(1, factorialUno);
        assertEquals(120, factorialCinco);
    }
    @Test(expected = Exception.class)
    public void testFactorialNegativo() {
        //when
        long factorialNegativo = factorial.calculaFactorial(-1);
        //then
        assertNull(null);
    }
}
