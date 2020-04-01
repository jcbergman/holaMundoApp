
package com.com470.holaMundoApp.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class UtilidadesTest {

   
     @Test
    public void testConcatenar() {
        System.out.println("concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        //instanciar la clase a probar
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    //en la implementacion
    @Test
    public void testConcatenarFallo() {
        System.out.println("concatenar");
        String uno = "Hola";
        String dos = "Mundo";
        //instanciar la clase a probar
        Utilidades instance = new Utilidades();
        String expResult = "Hola Mundo";
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
        
    }
    //error en la codificacion
    @Test
    public void testConcatenarError() {
        System.out.println("concatenar");
        String uno = null;
        String dos = "Mundo";
        //instanciar la clase a probar
        Utilidades instance = new Utilidades();
        String expResult = null;
        String result = instance.concatenar(uno, dos);
        assertEquals(expResult, result);
    }
}
