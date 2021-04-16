package utils;

import controllers.AnimeController;
import controllers.EstudioController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Anime;
import models.Estudio;

public class Pruebas {

    public static void main(String[] args) {

        String cadena_conexion = "jdbc:mysql://localhost:3306/animeland?characterEncoding=utf8";
        String usuario = "root";
        String contrasena = "1234";

        try {
            Connection conn = new Conexion(cadena_conexion, usuario, contrasena).getConnection();
            AnimeController ac = new AnimeController(conn);
            EstudioController ec = new EstudioController(conn);
            ResultSet rs = ac.selectAllAnimes();
            ResultSet rset = ec.selectAllEstudios();
            
            while (rs.next()) {
                int id = rs.getInt("nID");
                String nombre = rs.getString("cNombre");
                String genero = rs.getString("cGenero");
                int temporadas = rs.getInt("nTemporadas");
                boolean emision = rs.getBoolean("lEmision");
                Anime a1 = new Anime(id, nombre, genero, temporadas, emision);
                System.out.println(a1);
            }
            
            while (rset.next()) {
                int cif = rset.getInt("nCIF");
                String nombre = rset.getString("cNombre");
                int trabajadores = rset.getInt("nTrabajadores");
                String pais = rset.getString("cPais");
                String ciudad = rset.getString("cCiudad");
                Estudio e1 = new Estudio(cif, nombre, trabajadores, pais, ciudad);
                System.out.println(e1);
            }
            
            //cerrar recursos
            rset.close();
            rs.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
