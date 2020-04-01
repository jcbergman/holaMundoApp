package com.com470.holaMundoApp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    //parametros de conexion
    public final String bd = "bd_agenda";
    public final String url = "jdbc://mysql://localhost/" + bd + "?";
    public final String user = "root";
    public final String pass = "";

    public ConexionBD() {
    }
    public Connection getConexionBD() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(this.url + "user=" + this.user + "&password" + this.pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    

}
