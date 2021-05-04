package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Estudio;
import models.EstudioDAO;

public class EstudioController implements EstudioDAO {
    
    private final String SELECT_ALL = "SELECT * FROM estudio";
    private final String INSERT_INTO = "INSERT INTO Estudio (nCIF, cNombre, nTrabajadores, cPais, cCiudad) VALUES (?, ?, ?, ?, ?)";
    private final String UPDATE = "UPDATE Estudio SET cNombre=?, nTrabajadores=?, cPais=?, cCiudad=? WHERE nCIF=?";
    private final String DELETE = "DELETE FROM Estudio WHERE nCIF=?";
    
    private Connection conn;

    public EstudioController(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Estudio> selectAllEstudios() {
        PreparedStatement stm;
        ResultSet rs = null;
        List <Estudio> lista = new ArrayList<Estudio>();
        try {
            stm = this.conn.prepareStatement(SELECT_ALL);
            rs = stm.executeQuery();
            
            while (rs.next()){
                int cif = rs.getInt("nCIF");
                String nombre = rs.getString("cNombre");
                int trabajadores = rs.getInt("nTrabajadores");
                String pais = rs.getString("cPais");
                String ciudad = rs.getString("cCiudad");
                Estudio e = new Estudio(cif, nombre, trabajadores, pais, ciudad);
                lista.add(e);
            }
            //stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    @Override
    public boolean insertEstudio(int nCIF, String cNombre, int nTrabajadores, String cPais, String cCiudad) {
        boolean query = false;
        PreparedStatement stm;
        try {
            stm = this.conn.prepareStatement(INSERT_INTO);
            stm.setInt(1, nCIF);
            stm.setString(2, cNombre);
            stm.setInt(3, nTrabajadores);
            stm.setString(4, cPais);
            stm.setString(5, cCiudad);
            int rowsInserted = stm.executeUpdate();
            if (rowsInserted > 0) {
                query = true;
            } else {
                query = false;
            }
            //stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return query;
    }

    @Override
    public boolean deleteEstudio(int nCIF) {
        boolean query = false;
        PreparedStatement stm;
        try {
            stm = this.conn.prepareStatement(DELETE);
            stm.setInt(1, nCIF);
            int rowsInserted = stm.executeUpdate();
            if (rowsInserted > 0) {
                query = true;
            } else {
                query = false;
            }
            //stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return query;
    }

    @Override
    public boolean updateEstudio(int nCIF, String cNombre, int nTrabajadores, String cPais, String cCiudad) {
        boolean query = false;
        PreparedStatement stm;
        try {
            stm = this.conn.prepareStatement(UPDATE);
            stm.setInt(5, nCIF);
            stm.setString(1, cNombre);
            stm.setInt(2, nTrabajadores);
            stm.setString(3, cPais);
            stm.setString(4, cCiudad);
            int rowsInserted = stm.executeUpdate();
            if (rowsInserted > 0) {
                query = true;
            } else {
                query = false;
            }
            //stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return query;
    }

    @Override
    public ResultSet selectEstudioByName(String cNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
