package kontroler;

import dto.LoginPodaciDTO;
import konekcija.DBBroker;

/**
 *
 * @author lukas
 */
public class Kontroler {
    private static Kontroler instance;
    private DBBroker dbb;
    
    private Kontroler() {
        dbb = new DBBroker();
    }

    public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    public boolean proveriSifru(LoginPodaciDTO lozinka) {
        return dbb.proveriSifru(lozinka);
    }
    
    
}
