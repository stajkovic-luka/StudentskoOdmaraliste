package domen;

/**
 *
 * @author lukas
 */
public class Smena {
    private int idSmena;
    private String prostorija;
    private String komentar;
    private TipSmene tipSmene;

    public Smena() {
    }

    public Smena(int idSmena, String prostorija, String komentar, TipSmene tipSmene) {
        this.idSmena = idSmena;
        this.prostorija = prostorija;
        this.komentar = komentar;
        this.tipSmene = tipSmene;
    }

    public int getIdSmena() {
        return idSmena;
    }

    public void setIdSmena(int idSmena) {
        this.idSmena = idSmena;
    }

    public String getProstorija() {
        return prostorija;
    }

    public void setProstorija(String prostorija) {
        this.prostorija = prostorija;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public TipSmene getTipSmene() {
        return tipSmene;
    }

    public void setTipSmene(TipSmene tipSmene) {
        this.tipSmene = tipSmene;
    }
    
    
}
