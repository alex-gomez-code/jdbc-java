package models;

public class Anime {

    private int nID;
    private String cNombre;
    private String cGenero;
    private int nTemporadas;
    private boolean lEmision;

    public Anime(int nID, String cNombre, String cGenero, int nTemporadas, boolean lEmision) {
        super();
        this.nID = nID;
        this.cNombre = cNombre;
        this.cGenero = cGenero;
        this.nTemporadas = nTemporadas;
        this.lEmision = lEmision;
    }

    public int getnID() {
        return nID;
    }

    public void setnID(int nID) {
        this.nID = nID;
    }

    public String getcNombre() {
        return cNombre;
    }

    public void setcNombre(String cNombre) {
        this.cNombre = cNombre;
    }

    public String getcGenero() {
        return cGenero;
    }

    public void setcGenero(String cGenero) {
        this.cGenero = cGenero;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    public boolean islEmision() {
        return lEmision;
    }

    public void setlEmision(boolean lEmision) {
        this.lEmision = lEmision;
    }

    @Override
    public String toString() {
        return "Anime{" + "nID=" + nID + ", cNombre=" + cNombre + ", cGenero=" + cGenero + ", nTemporadas=" + nTemporadas + ", lEmision=" + lEmision + '}';
    }
    
}
