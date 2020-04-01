package com.com470.holaMundoApp.service;

import com.com470.holaMundoApp.model.Persona;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilidadesSameTest {

    private UtilidadesSame utils;

    @Before
    public void setUp() {
        utils = new UtilidadesSame();
    }

    @Test
    public void testSame() {
        //dada una persona que le pasamos el nombre y apellido
        Persona p = new Persona("Juan", "Perez");
        //cuando
        Persona resultado = utils.devuelveObjeto(p);
        //entonces
        assertSame(p, resultado);
        assertEquals(p, resultado);
    }
    @Test
    public void testNotSame() {
        //dada una persona que le pasamos el nombre y apellido
        Persona p = new Persona("Marco", "Vargas");
        //cuando
        Persona resultado = utils.devuelveObjeto(p);
        //entonces
        assertNotSame(p, resultado);
        assertNotEquals(p, resultado);
    }
    @Test
    public void testNotSame2() {
        //dada una persona que le pasamos el nombre y apellido
        Persona p = new Persona("Maria", "Lopez");
        //cuando
        Persona resultado = utils.devuelveObjeto(p);
        //entonces
        assertNotSame(p, resultado);
        assertEquals(p, resultado);
    }

}
