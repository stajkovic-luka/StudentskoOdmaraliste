/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author lukas
 */
public class Status implements Serializable{
    private int idStatus;
    private int godinaStudija;
    private boolean budzet;
    private Date datumVazenjaOd;
    private Date datumVazenjaDo;

    public Status() {
    }

    public Status(int idStatus, int godinaStudija, boolean budzet, Date datumVazenjaOd, Date datumVazenjaDo) {
        this.idStatus = idStatus;
        this.godinaStudija = godinaStudija;
        this.budzet = budzet;
        this.datumVazenjaOd = datumVazenjaOd;
        this.datumVazenjaDo = datumVazenjaDo;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public boolean isBudzet() {
        return budzet;
    }

    public void setBudzet(boolean budzet) {
        this.budzet = budzet;
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
    
    
    
}
