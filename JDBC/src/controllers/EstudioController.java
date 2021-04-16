package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.Estudio;
import models.EstudioDAO;

public class EstudioController implements EstudioDAO {
    
    private final String SELECT_ALL = "SELECT * FROM estudio";
    
    private Connection conn;

    public EstudioController(Connection conn) {
        this.conn = conn;
    }

    @Override
    public ResultSet selectAllEstudios() {
        PreparedStatement stm;
        ResultSet rs = null;
        try {
            stm = this.conn.prepareStatement(SELECT_ALL);
            rs = stm.executeQuery();
            //stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    @Override
    public Estudio insertEstudio(int nCIF, String cNombre, String nTrabajadores, int cPais, boolean cCiudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estudio deleteEstudio(int nCIF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estudio updateEstudio(int nCIF, String cNombre, String nTrabajadores, int cPais, boolean cCiudad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectEstudioByName(String cNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
