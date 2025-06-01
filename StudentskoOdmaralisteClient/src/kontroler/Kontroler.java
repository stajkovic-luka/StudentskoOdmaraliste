package kontroler;

import dto.LoginPodaciDTO;
import komunikacija.Komunikacija;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author lukas
 */
public class Kontroler {

    private static Kontroler instance;
    private System.Logger logger = System.getLogger("Kontroler");

    private Kontroler() {

    }

    public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    public boolean logIn(String username, String password) {
        KlijentskiZahtev zahtevZaLogin = new KlijentskiZahtev(1, new LoginPodaciDTO(username, password));

        logger.log(System.Logger.Level.INFO, "Zahtev za poslat...");
        Komunikacija.getInstance().posaljiZatev(zahtevZaLogin);

        ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
        logger.log(System.Logger.Level.INFO, "Zahtev za primljen...");
        return (boolean) so.getOdgovor();
        
        
    }

}
