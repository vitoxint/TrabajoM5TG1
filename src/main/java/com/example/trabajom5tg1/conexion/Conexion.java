package com.example.trabajom5tg1.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar()
    {
        Connection con = null;
        String driver = "com.mysql.cj.jdbc.Driver";

        String usuario ="javadmin";
        String password = "C0ntrasenna$Pul3nt4";
        String url = "jdbc:mysql://149.50.130.78/prevencion_riesgos";

        try
        {
            Class.forName(driver); // here is the ClassNotFoundException
            con = DriverManager.getConnection(url,usuario,password);

            if(con !=null)
            {
                System.out.println("Conectado");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("No se pudo conectar a BD");
            e.printStackTrace();
        }
        return con;
    }
}
