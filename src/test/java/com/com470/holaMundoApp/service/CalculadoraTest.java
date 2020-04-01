package com.com470.holaMundoApp.service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSuma() {
        //when
        int resultado = calculadora.suma(2, 2);
        //then
        assertEquals(4, resultado);
        if (resultado!=4) {
            assertFalse(true);
        }
    }

    @Test
    public void testResta() {
        //when
        int resultado = calculadora.resta(2, 2);
        //then
        assertEquals(0, resultado);
    }

    @Test
    public void testMultimplicacion() {
        //when
        int resultado = calculadora.multimplicacion(2, 2);
        //then
        assertEquals(4, resultado);
    }

    @Test
    public void testDivision() {
        //when
        int resultado = calculadora.division(6, 2);
        //then
        assertEquals(3, resultado);
    }
    @Test (expected = Exception.class)
    public void testDivisionEntreCero() {
        //when
        int resultado = calculadora.division(6, 0);
        //then
        assertNull("no es posible dividir entre cero", null);
    }

}
