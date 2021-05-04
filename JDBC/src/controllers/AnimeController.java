package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Anime;
import models.AnimeDAO;

public class AnimeController implements AnimeDAO {

    private final String SELECT_ALL = "SELECT * FROM anime";
    private final String INSERT_INTO = "INSERT INTO Anime (nID, cNombre, cGenero, nTemporadas, lEmision) VALUES (?, ?, ?, ?, ?)";
    private final String UPDATE = "UPDATE Anime SET cNombre=?, cGenero=?, nTemporadas=?, lEmision=? WHERE nID=?";
    private final String DELETE = "DELETE FROM Anime WHERE nID=?";

    private Connection conn;

    public AnimeController(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Anime> selectAllAnimes() {
        PreparedStatement stm;
        ResultSet rs = null;
        List<Anime> lista = new ArrayList<Anime>();
        try {
            stm = this.conn.prepareStatement(SELECT_ALL);
            rs = stm.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("nID");
                String nombre = rs.getString("cNombre");
                String genero = rs.getString("cGenero");
                int temporadas = rs.getInt("nTemporadas");
                boolean emision = rs.getBoolean("lEmision");
                Anime a = new Anime(id, nombre, genero, temporadas, emision);
                lista.add(a);
            }

            //stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    @Override
    public boolean insertAnime(int nID, String cNombre, String cGenero, int nTemporadas, boolean lEmision) {
        boolean query = false;
        PreparedStatement stm;
        try {
            stm = this.conn.prepareStatement(INSERT_INTO);
            stm.setInt(1, nID);
            stm.setString(2, cNombre);
            stm.setString(3, cGenero);
            stm.setInt(4, nTemporadas);
            stm.setBoolean(5, lEmision);
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
    public boolean deleteAnime(int nID) {
        boolean query = false;
        PreparedStatement stm;
        try {
            stm = this.conn.prepareStatement(DELETE);
            stm.setInt(1, nID);
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
    public boolean updateAnime(int nID, String cNombre, String cGenero, int nTemporadas, boolean lEmision) {
        boolean query = false;
        PreparedStatement stm;
        try {
            stm = this.conn.prepareStatement(UPDATE);
            stm.setInt(5, nID);
            stm.setString(1, cNombre);
            stm.setString(2, cGenero);
            stm.setInt(3, nTemporadas);
            stm.setBoolean(4, lEmision);
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
    public boolean selectAnimeByName(String cNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
