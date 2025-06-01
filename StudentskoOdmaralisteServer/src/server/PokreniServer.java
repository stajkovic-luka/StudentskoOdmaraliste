package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lukas
 */
public class PokreniServer extends Thread {

    private Logger logger = Logger.getLogger(PokreniServer.class.getName());
    private ServerSocket ss;
    private boolean radi = true;

    @Override
    public void run() {
        try {
            ss = new ServerSocket(9000);
            while (radi) {
                Socket s = ss.accept();
                logger.log(Level.INFO, "Server je pokrenut.");
                ObradaKlijentskihZahteva nit = new ObradaKlijentskihZahteva(s);
                nit.start();
            }

        } catch (IOException ex) {
            if (radi) {
                Logger.getLogger(PokreniServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void zaustaviServer() {
        try {
            radi = false;
            if (ss != null && !ss.isClosed()) {
                ss.close();
            }
            logger.log(Level.INFO, "Server je zaustavljen.");

        } catch (IOException ex) {
            Logger.getLogger(PokreniServer.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
