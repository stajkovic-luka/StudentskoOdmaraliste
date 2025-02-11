/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.util.Date;

/**
 *
 * @author lukas
 */
public class SluzbenikSmena {
    private Sluzbenik sluzbenik;
    private Smena smena;
    private Date datumSmene;

    public SluzbenikSmena() {
    }

    public SluzbenikSmena(Sluzbenik sluzbenik, Smena smena, Date datumSmene) {
        this.sluzbenik = sluzbenik;
        this.smena = smena;
        this.datumSmene = datumSmene;
    }

    public Sluzbenik getSluzbenik() {
        return sluzbenik;
    }

    public void setSluzbenik(Sluzbenik sluzbenik) {
        this.sluzbenik = sluzbenik;
    }

    public Smena getSmena() {
        return smena;
    }

    public void setSmena(Smena smena) {
        this.smena = smena;
    }

    public Date getDatumSmene() {
        return datumSmene;
    }

    public void setDatumSmene(Date datumSmene) {
        this.datumSmene = datumSmene;
    }
    
    
}
