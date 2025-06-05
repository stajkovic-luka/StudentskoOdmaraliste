package server;

import dto.LoginOdgovorDTO;
import dto.LoginZahtevDTO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import kontroler.Kontroler;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;


public class ObradaKlijentskihZahteva extends Thread {

    private Socket s;

    public ObradaKlijentskihZahteva(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            while (!s.isClosed()) {
                KlijentskiZahtev kz = primiZahtev();
                if (kz == null) {
                    break;
                }
                ServerskiOdgovor so = new ServerskiOdgovor();

                switch (kz.getOperacija()) {
                    case 1: // LOGIN
                        
                        LoginOdgovorDTO odgovor = Kontroler.getInstance()
                                
                                .proveriSifru((LoginZahtevDTO) kz.getParametar());
                        
                        so.setOdgovor(odgovor);
                        
                        break;
                    default:
                        throw new AssertionError("Nepoznata operacija: " + kz.getOperacija());
                }
                posaljiOdgovor(so);
            }
        } finally {
            try {
                s.close();
            } catch (IOException ex) {
                Logger.getLogger(ObradaKlijentskihZahteva.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
    }

    private KlijentskiZahtev primiZahtev() {
        try {
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            try {
                return (KlijentskiZahtev) ois.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ObradaKlijentskihZahteva.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(ObradaKlijentskihZahteva.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private void posaljiOdgovor(ServerskiOdgovor so) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(so);
            oos.flush();
        } catch (IOException ex) {
            Logger.getLogger(ObradaKlijentskihZahteva.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
}
