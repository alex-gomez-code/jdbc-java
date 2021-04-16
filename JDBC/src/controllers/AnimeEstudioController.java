package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.AnimeEstudio;
import models.AnimeEstudioDAO;

public class AnimeEstudioController implements AnimeEstudioDAO {
    private final String SELECT_ALL = "SELECT * FROM animeestudio";
    
    private Connection conn;

    public AnimeEstudioController(Connection conn) {
        this.conn = conn;
    }

    @Override
    public ResultSet selectAllAnimeEstudios() {
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
    public AnimeEstudio insertAnimeEstudio(int nID, int nCIF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AnimeEstudio deleteAnimeEstudio(int nID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AnimeEstudio updateAnimeEstudio(int nID, int nCIF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
