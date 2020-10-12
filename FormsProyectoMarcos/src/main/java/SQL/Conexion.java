/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joel Enriquez
 */
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/Hospital";
    private String user = "root";
    private String password = "74ef6a14";
    private static Connection conexion = null;

    public static Connection Conexion() {
        if (conexion == null) {
            new Conexion();
        }
        return conexion;
    }

    private Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, user, password);
            System.out.println("conexion establecida");

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se ha podido generar la conexion");
        }
    }
}
