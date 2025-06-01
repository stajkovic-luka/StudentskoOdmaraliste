/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author lukas
 */
public class Sluzbenik implements Serializable{
    private int idSluzbenik;
    private String ime;
    private String prezime;
    private String korisnickoIme;
    private String lozinka;

    public Sluzbenik() {
    }

    public Sluzbenik(int idSluzbenik, String ime, String prezime, String korisnickoIme, String lozinka) {
        this.idSluzbenik = idSluzbenik;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
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

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public String toString() {
        return "Sluzbenik{" + "idSluzbenik=" + idSluzbenik + ", ime=" + ime + ", prezime=" + prezime + ", korisnickoIme=" + korisnickoIme + ", lozinka=" + lozinka + '}';
    }
    
    
    
    
}
