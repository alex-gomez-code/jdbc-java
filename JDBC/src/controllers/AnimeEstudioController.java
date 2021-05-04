package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.AnimeEstudio;
import models.AnimeEstudioDAO;
import models.Estudio;

public class AnimeEstudioController implements AnimeEstudioDAO {

    private final String SELECT_ALL = "SELECT * FROM animeestudio";
    private final String INSERT_INTO = "INSERT INTO AnimeEstudio (nID, nCIF) VALUES (?, ?)";
    private final String UPDATE = "UPDATE Estudio SET nCIF=? WHERE nID=?";
    private final String DELETE = "DELETE FROM AnimeEstudio WHERE nID=?";

    private Connection conn;

    public AnimeEstudioController(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<AnimeEstudio> selectAllAnimeEstudios() {
        PreparedStatement stm;
        ResultSet rs = null;
        List<AnimeEstudio> lista = new ArrayList<AnimeEstudio>();
        try {
            stm = this.conn.prepareStatement(SELECT_ALL);
            rs = stm.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("nID");
                int cif = rs.getInt("nCIF");
                AnimeEstudio ae = new AnimeEstudio(id, cif);
                lista.add(ae);
            }
            //stm.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    @Override
    public boolean insertAnimeEstudio(int nID, int nCIF) {
        boolean query = false;
        PreparedStatement stm;
        try {
            stm = this.conn.prepareStatement(INSERT_INTO);
            stm.setInt(1, nID);
            stm.setInt(2, nCIF);
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
    public boolean deleteAnimeEstudio(int nID) {
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
    public boolean updateAnimeEstudio(int nID, int nCIF) {
        boolean query = false;
        PreparedStatement stm;
        try {
            stm = this.conn.prepareStatement(UPDATE);
            stm.setInt(2, nID);
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
}
