package models;

import java.sql.ResultSet;

public interface AnimeEstudioDAO {
    //CRUD
    public ResultSet selectAllAnimeEstudios();
    public AnimeEstudio insertAnimeEstudio(int nID, int nCIF);
    public AnimeEstudio deleteAnimeEstudio(int nID);
    public AnimeEstudio updateAnimeEstudio(int nID, int nCIF);
}
