package models;

public class AnimeEstudio {
    private int nID;
    private int nCIF;

    public AnimeEstudio(int nID, int nCIF) {
        this.nID = nID;
        this.nCIF = nCIF;
    }

    public int getnID() {
        return nID;
    }

    public void setnID(int nID) {
        this.nID = nID;
    }

    public int getnCIF() {
        return nCIF;
    }

    public void setnCIF(int nCIF) {
        this.nCIF = nCIF;
    }

    @Override
    public String toString() {
        return "AnimeEstudio{" + "nID=" + nID + ", nCIF=" + nCIF + '}';
    }
    
}
