package com.com470.holaMundoApp.service;

import java.sql.Connection;
import java.sql.SQLException;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConexionBDTest {
    private ConexionBD conexion;
    
  @Test
    public void testGetConexionBD()  {
        conexion=new ConexionBD();
        //when
        Connection con = conexion.getConexionBD();
        //then
        if (con==null) {
            //fail("La conexion ha fallado");
            Assert.fail("no hay conexion");
        }
        assertEquals("bd_agenda", conexion.bd);
        assertThat(conexion.bd,Matchers.equalTo("bd_agenda"));
        assertThat(con, Matchers.notNullValue());
        
        
    }
    
}
