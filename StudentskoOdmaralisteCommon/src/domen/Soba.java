package domen;

import java.io.Serializable;

/**
 *
 * @author lukas
 */
public class Soba implements Serializable{
    private int idSoba;
    private int kapacitet;
    private int zauzetoMesta;
    private int sprat;
    private double cena;

    public Soba() {
    }

    public Soba(int idSoba, int kapacitet, int zauzetoMesta, int sprat, double cena) {
        this.idSoba = idSoba;
        this.kapacitet = kapacitet;
        this.zauzetoMesta = zauzetoMesta;
        this.sprat = sprat;
        this.cena = cena;
    }

    public int getIdSoba() {
        return idSoba;
    }

    public void setIdSoba(int idSoba) {
        this.idSoba = idSoba;
    }

    public int getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(int kapacitet) {
        this.kapacitet = kapacitet;
    }

    public int getZauzetoMesta() {
        return zauzetoMesta;
    }

    public void setZauzetoMesta(int zauzetoMesta) {
        this.zauzetoMesta = zauzetoMesta;
    }

    public int getSprat() {
        return sprat;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    
    
}
