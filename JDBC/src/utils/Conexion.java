package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private String cadena_conexion = "jdbc:mysql://localhost:3306/animeland?characterEncoding=utf8";
    private String usuario = "root";
    private String contrasena = "1234";

    public Conexion(String cadena_conexion, String usuario, String contrasena) {
        this.cadena_conexion = cadena_conexion;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    //método para conectarse que devolverá la conexión
    public Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(cadena_conexion, usuario, contrasena);
            return conn;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    //método para desconectarse void
    public void closeConnection(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public String getCadena_conexion() {
        return cadena_conexion;
    }

    public void setCadena_conexion(String cadena_conexion) {
        this.cadena_conexion = cadena_conexion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
