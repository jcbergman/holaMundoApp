
package com.com470.holaMundoApp.service;

import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class UtilidadesThatTest {
    

    @Before
    public void setUp() {
    }

    @Test
    public void testConcatenar() {
        System.out.println("concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        assertThat(result,Matchers.is("Hola Mundo"));
        assertThat(result, Matchers.equalTo("Hola Mundo"));
        assertThat(result, not(Matchers.equalTo("Adios")));
        assertThat(result, is(not(Matchers.equalTo("holA"))));
        assertThat(result, Matchers.notNullValue());
        assertThat(result, is(Matchers.notNullValue()));
        //fail("The test case is a prototype.");
    }
    
}
