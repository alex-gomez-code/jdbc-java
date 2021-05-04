package models;

import java.sql.ResultSet;
import java.util.List;

public interface EstudioDAO {
    //CRUD
    public List<Estudio> selectAllEstudios();
    public boolean insertEstudio(int nCIF, String cNombre, int nTrabajadores, String cPais, String cCiudad);
    public boolean deleteEstudio(int nCIF);
    public boolean updateEstudio(int nCIF, String cNombre, int nTrabajadores, String cPais, String cCiudad);
    //extra
    public ResultSet selectEstudioByName(String cNombre);
}
