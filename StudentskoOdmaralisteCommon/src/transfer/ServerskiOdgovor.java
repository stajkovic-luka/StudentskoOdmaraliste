package transfer;

import java.io.Serializable;

/**
 *
 * @author lukas
 */
public class ServerskiOdgovor implements Serializable {

    private Object odgovor;

    public ServerskiOdgovor() {
    }

    public ServerskiOdgovor(Object odgovor) {
        this.odgovor = odgovor;
    }

    public Object getOdgovor() {
        return odgovor;
    }

    public void setOdgovor(Object odgovor) {
        this.odgovor = odgovor;
    }

}
