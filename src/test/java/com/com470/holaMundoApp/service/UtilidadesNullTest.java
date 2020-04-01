
package com.com470.holaMundoApp.service;

import com.com470.holaMundoApp.model.Persona;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class UtilidadesNullTest {
    private UtilidadesNull utils;
    
    @Before
    public void setUp() {
        utils=new UtilidadesNull();
    }

    @Test
    public void testBuscaPersona() {
        //cuando
        Persona personaA = utils.buscaPersona("Juan");
        Persona personaNull = utils.buscaPersona("Pepe");
        //entonces
        assertNull("es null",personaNull);
        assertNotNull("no es null",personaA);
    }
    
}
