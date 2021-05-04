package models;

import java.sql.ResultSet;
import java.util.List;

public interface AnimeDAO {
    //CRUD
    public List<Anime> selectAllAnimes();
    public boolean insertAnime(int nID, String cNombre, String cGenero, int nTemporadas, boolean lEmision);
    public boolean deleteAnime(int nID);
    public boolean updateAnime(int nID, String cNombre, String cGenero, int nTemporadas, boolean lEmision);
    //extra
    public boolean selectAnimeByName(String cNombre);
}
