
package com.com470.holaMundoApp.service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class UtilidadesArrayTest {
    //declarar
    private Utilidades utils;
    
    @Before
    public void setUp() {
    //instanciar
    utils=new Utilidades();
    }

    @Test
    public void testGetArrayStrings() {
        //given
        String[] esperado={"uno","dos","tres"};
        //when
        String[] resultado = utils.getArrayStrings("uno","dos","tres");
        //then
        assertArrayEquals(esperado, resultado);
        assertEquals(3, resultado.length);
        assertEquals(esperado.length, resultado.length);
        assertEquals(esperado[0], resultado[0]);
        assertEquals(esperado[1], resultado[1]);
        assertEquals(esperado[2], resultado[2]);
        assertNotEquals(esperado[0], resultado[1]);
        assertNotEquals(esperado[0], resultado[2]);
    }
    @Test
    public void testEsMayorQue10() {
        //when
        boolean resultadoTrue = utils.esMayorQue10(20);
        boolean resultadoFalse = utils.esMayorQue10(5);
        //then
        assertTrue(resultadoTrue);
        assertFalse(resultadoFalse);
    }
    
}
