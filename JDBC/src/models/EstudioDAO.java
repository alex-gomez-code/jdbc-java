package models;

import java.sql.ResultSet;

public interface EstudioDAO {
    //CRUD
    public ResultSet selectAllEstudios();
    public Estudio insertEstudio(int nCIF, String cNombre, String nTrabajadores, int cPais, boolean cCiudad);
    public Estudio deleteEstudio(int nCIF);
    public Estudio updateEstudio(int nCIF, String cNombre, String nTrabajadores, int cPais, boolean cCiudad);
    //extra
    public ResultSet selectEstudioByName(String cNombre);
}
