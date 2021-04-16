package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Anime;
import models.AnimeDAO;

public class AnimeController implements AnimeDAO {
    
    private final String SELECT_ALL = "SELECT * FROM anime";
    private final String INSERT_INTO = "INSERT INTO anime VALUES (";
    
    private Connection conn;

    public AnimeController(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public ResultSet selectAllAnimes() {
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
    public Anime insertAnime(int nID, String cNombre, String cGenero, int nTemporadas, boolean lEmision) {
        PreparedStatement stm;
        Anime a = new Anime(nID, cNombre, cGenero, nTemporadas, lEmision);
        ResultSet rs = null;
        try {
            stm = this.conn.prepareStatement(INSERT_INTO + nID + ", " + cNombre + ", " + cGenero + ", " + nTemporadas + ", " + lEmision);
            rs = stm.executeQuery();
            //stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return a;
    }

    @Override
    public Anime deleteAnime(int nID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Anime updateAnime(int nID, String cNombre, String cGenero, int nTemporadas, boolean lEmision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet selectAnimeByName(String cNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
