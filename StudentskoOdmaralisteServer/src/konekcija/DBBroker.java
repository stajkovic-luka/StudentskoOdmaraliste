package konekcija;

import dto.LoginZahtevDTO;
import dto.LoginOdgovorDTO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import konekcija.Konekcija;

public class DBBroker {

 
    public LoginOdgovorDTO proveriSifru(LoginZahtevDTO lozinka) {
        String username = lozinka.username();
        String password = lozinka.password();

        String upit = """
            SELECT idSluzbenik, ime, prezime, korisnickoIme
              FROM sluzbenik
             WHERE korisnickoIme = ? AND lozinka = ?
            """;

        try {
            PreparedStatement ps = Konekcija.getInstance()
                                            .getConnection()
                                            .prepareStatement(upit);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int    id       = rs.getInt("idSluzbenik");
                String ime      = rs.getString("ime");
                String prezime  = rs.getString("prezime");
                String korisnik = rs.getString("korisnickoIme");
                return new LoginOdgovorDTO(id, ime, prezime, korisnik);
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
