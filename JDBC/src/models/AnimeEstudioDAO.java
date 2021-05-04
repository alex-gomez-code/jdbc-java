package models;

import java.sql.ResultSet;
import java.util.List;

public interface AnimeEstudioDAO {
    //CRUD
    public List<AnimeEstudio> selectAllAnimeEstudios();
    public boolean insertAnimeEstudio(int nID, int nCIF);
    public boolean deleteAnimeEstudio(int nID);
    public boolean updateAnimeEstudio(int nID, int nCIF);
}
