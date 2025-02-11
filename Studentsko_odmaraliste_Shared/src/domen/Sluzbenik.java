/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author lukas
 */
public class Sluzbenik {
    private int idSluzbenik;
    private String ime;
    private String prezime;
    private String korisnickoIme;
    private String lozina;

    public Sluzbenik() {
    }

    public Sluzbenik(int idSluzbenik, String ime, String prezime, String korisnickoIme, String lozina) {
        this.idSluzbenik = idSluzbenik;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.lozina = lozina;
    }

    public int getIdSluzbenik() {
        return idSluzbenik;
    }

    public void setIdSluzbenik(int idSluzbenik) {
        this.idSluzbenik = idSluzbenik;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozina() {
        return lozina;
    }

    public void setLozina(String lozina) {
        this.lozina = lozina;
    }

    @Override
    public String toString() {
        return "Sluzbenik{" + "idSluzbenik=" + idSluzbenik + ", ime=" + ime + ", prezime=" + prezime + ", korisnickoIme=" + korisnickoIme + ", lozina=" + lozina + '}';
    }
    
    
}
