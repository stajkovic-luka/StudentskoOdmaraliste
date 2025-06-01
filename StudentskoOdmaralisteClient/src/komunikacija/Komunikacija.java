package komunikacija;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author lukas
 */
public class Komunikacija {
    private static Komunikacija instance;
    private Socket s;
    
    private Komunikacija() {
        try {
            s = new Socket("localhost", 9000);
        } catch (IOException ex) {
            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Komunikacija getInstance() {
        if (instance == null) {
            instance = new Komunikacija();
        }
        return instance;
    }
    
    public void posaljiZatev(KlijentskiZahtev kz){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(kz);
            oos.flush();
        } catch (IOException ex) {
            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ServerskiOdgovor primiOdgovor(){
        try {
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            try {
                return (ServerskiOdgovor) ois.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
