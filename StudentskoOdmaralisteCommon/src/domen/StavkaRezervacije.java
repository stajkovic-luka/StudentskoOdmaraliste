package domen;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author lukas
 */
public class StavkaRezervacije implements Serializable{
    private Rezervacija rezervacija;
    private int rb;
    private String nazivSmestaja;
    private int brSobe;
    private Date datumVazenjaOd;
    private Date datumVazenjaDo;
    private int brojDana;
    private double cena;
    private double iznos;
    private Soba soba;

    public StavkaRezervacije() {
    }

    public StavkaRezervacije(Rezervacija rezervacija, int rb, String nazivSmestaja, int brSobe, Date datumVazenjaOd, Date datumVazenjaDo, int brojDana, double cena, double iznos, Soba soba) {
        this.rezervacija = rezervacija;
        this.rb = rb;
        this.nazivSmestaja = nazivSmestaja;
        this.brSobe = brSobe;
        this.datumVazenjaOd = datumVazenjaOd;
        this.datumVazenjaDo = datumVazenjaDo;
        this.brojDana = brojDana;
        this.cena = cena;
        this.iznos = iznos;
        this.soba = soba;
    }

    public Rezervacija getRezervacija() {
        return rezervacija;
    }

    public void setRezervacija(Rezervacija rezervacija) {
        this.rezervacija = rezervacija;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public String getNazivSmestaja() {
        return nazivSmestaja;
    }

    public void setNazivSmestaja(String nazivSmestaja) {
        this.nazivSmestaja = nazivSmestaja;
    }

    public int getBrSobe() {
        return brSobe;
    }

    public void setBrSobe(int brSobe) {
        this.brSobe = brSobe;
    }

    public Date getDatumVazenjaOd() {
        return datumVazenjaOd;
    }

    public void setDatumVazenjaOd(Date datumVazenjaOd) {
        this.datumVazenjaOd = datumVazenjaOd;
    }

    public Date getDatumVazenjaDo() {
        return datumVazenjaDo;
    }

    public void setDatumVazenjaDo(Date datumVazenjaDo) {
        this.datumVazenjaDo = datumVazenjaDo;
    }

    public int getBrojDana() {
        return brojDana;
    }

    public void setBrojDana(int brojDana) {
        this.brojDana = brojDana;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public Soba getSoba() {
        return soba;
    }

    public void setSoba(Soba soba) {
        this.soba = soba;
    }

    @Override
    public String toString() {
        return "StavkaRezervacije{" + "rezervacija=" + rezervacija + ", rb=" + rb + ", nazivSmestaja=" + nazivSmestaja + ", brSobe=" + brSobe + ", datumVazenjaOd=" + datumVazenjaOd + ", datumVazenjaDo=" + datumVazenjaDo + ", brojDana=" + brojDana + ", cena=" + cena + ", iznos=" + iznos + ", soba=" + soba + '}';
    }

    
  
    
    
}
