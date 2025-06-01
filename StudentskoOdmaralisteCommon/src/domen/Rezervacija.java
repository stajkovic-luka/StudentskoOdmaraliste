package domen;

import java.io.Serializable;

/**
 *
 * @author lukas
 */
public class Rezervacija implements Serializable{
    private int idRezervacija;
    private double popust;
    private double cenaNakonPopusta;
    private double ukupanIznos;
    private String napomenaStudenta;
    private Sluzbenik sluzbenik;
    private Student student;

    public Rezervacija() {
    }

    public Rezervacija(int idRezervacija, double popust, double cenaNakonPopusta, double ukupanIznos, String napomenaStudenta, Sluzbenik sluzbenik, Student student) {
        this.idRezervacija = idRezervacija;
        this.popust = popust;
        this.cenaNakonPopusta = cenaNakonPopusta;
        this.ukupanIznos = ukupanIznos;
        this.napomenaStudenta = napomenaStudenta;
        this.sluzbenik = sluzbenik;
        this.student = student;
    }

    public int getIdRezervacija() {
        return idRezervacija;
    }

    public void setIdRezervacija(int idRezervacija) {
        this.idRezervacija = idRezervacija;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public double getCenaNakonPopusta() {
        return cenaNakonPopusta;
    }

    public void setCenaNakonPopusta(double cenaNakonPopusta) {
        this.cenaNakonPopusta = cenaNakonPopusta;
    }

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public String getNapomenaStudenta() {
        return napomenaStudenta;
    }

    public void setNapomenaStudenta(String napomenaStudenta) {
        this.napomenaStudenta = napomenaStudenta;
    }

    public Sluzbenik getSluzbenik() {
        return sluzbenik;
    }

    public void setSluzbenik(Sluzbenik sluzbenik) {
        this.sluzbenik = sluzbenik;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Rezervacija{" + "idRezervacija=" + idRezervacija + ", popust=" + popust + ", cenaNakonPopusta=" + cenaNakonPopusta + ", ukupanIznos=" + ukupanIznos + ", napomenaStudenta=" + napomenaStudenta + ", sluzbenik=" + sluzbenik + ", student=" + student + '}';
    }
    
    
}
