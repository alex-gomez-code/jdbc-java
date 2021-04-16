package models;

public class Estudio {
    private int nCIF;
    private String cNombre;
    private int nTrabajadores;
    private String cPais;
    private String cCiudad;

    public Estudio(int nCIF, String cNombre, int nTrabajadores, String cPais, String cCiudad) {
        this.nCIF = nCIF;
        this.cNombre = cNombre;
        this.nTrabajadores = nTrabajadores;
        this.cPais = cPais;
        this.cCiudad = cCiudad;
    }

    public int getnCIF() {
        return nCIF;
    }

    public void setnCIF(int nCIF) {
        this.nCIF = nCIF;
    }

    public String getcNombre() {
        return cNombre;
    }

    public void setcNombre(String cNombre) {
        this.cNombre = cNombre;
    }

    public int getnTrabajadores() {
        return nTrabajadores;
    }

    public void setnTrabajadores(int nTrabajadores) {
        this.nTrabajadores = nTrabajadores;
    }

    public String getcPais() {
        return cPais;
    }

    public void setcPais(String cPais) {
        this.cPais = cPais;
    }

    public String getcCiudad() {
        return cCiudad;
    }

    public void setcCiudad(String cCiudad) {
        this.cCiudad = cCiudad;
    }

    @Override
    public String toString() {
        return "Estudio{" + "nCIF=" + nCIF + ", cNombre=" + cNombre + ", nTrabajadores=" + nTrabajadores + ", cPais=" + cPais + ", cCiudad=" + cCiudad + '}';
    }
    
}
