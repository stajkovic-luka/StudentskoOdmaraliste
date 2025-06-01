package konekcija;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lukas
 */
public class Konekcija {
    private Logger logger = Logger.getLogger(Konekcija.class.getName());
    private static Konekcija instance;
    private Connection connection;

    private Konekcija() {

        try {
            String ulr = "jdbc:mysql://localhost:3306/studentsko_odmaraliste";
            connection = DriverManager.getConnection(ulr, "root", "");
            logger.log(Level.INFO, "Konekcija sa bazom uspostavljena...");

            connection.setAutoCommit(false);

        } catch (SQLException ex) {
            Logger.getLogger(Konekcija.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Konekcija getInstance() {
        if (instance == null) {
            instance = new Konekcija();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
