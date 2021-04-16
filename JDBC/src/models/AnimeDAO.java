package models;

import java.sql.ResultSet;

public interface AnimeDAO {
    //CRUD
    public ResultSet selectAllAnimes();
    public Anime insertAnime(int nID, String cNombre, String cGenero, int nTemporadas, boolean lEmision);
    public Anime deleteAnime(int nID);
    public Anime updateAnime(int nID, String cNombre, String cGenero, int nTemporadas, boolean lEmision);
    //extra
    public ResultSet selectAnimeByName(String cNombre);
}
