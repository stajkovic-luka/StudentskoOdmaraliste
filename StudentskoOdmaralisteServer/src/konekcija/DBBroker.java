package konekcija;

import dto.LoginPodaciDTO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import konekcija.Konekcija;

/**
 *
 * @author lukas
 */
public class DBBroker {

    public boolean proveriSifru(LoginPodaciDTO lozinka) {
        String username = lozinka.username();
        String password = lozinka.password();

        String usernameDB = null;
        String passwordDB = null;
        
        try {
            String upit = "SELECT korisnickoIme, lozinka FROM sluzbenik WHERE korisnickoIme=? AND lozinka=?";
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                usernameDB = rs.getString("korisnickoIme");
                passwordDB = rs.getString("lozinka");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (username.equals(usernameDB) && password.equals(passwordDB)) {
            return true;
        }

        return false;
    }

}
