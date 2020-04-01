package com.com470.holaMundoApp.service;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidarEmailTest {
//instanciar la clase a usar
    ValidarEmail validar = ValidarEmail.getInstance();

    @After
    public void after() {

        validar.reset();
    }

    @Test
    public void testValidarEmail() {
        //given
        //ValidarEmail validar = ValidarEmail.getInstance();
        //when
        boolean resultado = validar.validaEmail("juancarlos.bergman@gmail.com");
        //then
        assertTrue(resultado);
    }

    @Test
    public void testValidarEmailSinArroba() {
        //when
        boolean resultado = validar.validaEmail("juancarlos.bergman.gmail");
        //then
        assertFalse(resultado);
    }
    //@Test
}
