package kontroler;

import dto.LoginOdgovorDTO;
import dto.LoginZahtevDTO;
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

    public LoginOdgovorDTO logIn(String username, String password) {
        // Prazna polja
        if (username == null || username.isBlank() || 
        password == null || password.isBlank()) {
        return null;
    }
        
        KlijentskiZahtev zahtevZaLogin = new KlijentskiZahtev(1, new LoginZahtevDTO(username, password));

        logger.log(System.Logger.Level.INFO, "Zahtev za poslat...");
        Komunikacija.getInstance().posaljiZatev(zahtevZaLogin);

        ServerskiOdgovor so = Komunikacija.getInstance().primiOdgovor();
        logger.log(System.Logger.Level.INFO, "Zahtev za primljen...");
        return (LoginOdgovorDTO) so.getOdgovor();
        
        
    }

}
