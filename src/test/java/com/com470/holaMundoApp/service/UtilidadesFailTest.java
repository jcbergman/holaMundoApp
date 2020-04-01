
package com.com470.holaMundoApp.service;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilidadesFailTest {
    
    
    
    @Before
    public void setUp() {
    }

    @Test
    public void testConcatenar() {
        System.out.println("concatenar");
        String uno = "";
        String dos = "";
        Utilidades instance = new Utilidades();
        String expResult = "";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    
}
