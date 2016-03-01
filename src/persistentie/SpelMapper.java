
package persistentie;

import domein.Spel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SpelMapper {
    public List<Spel> geefSpellen() {
    List<Spel> spellen = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(Connectie.JDBC_URL)) {
            PreparedStatement query = conn.prepareStatement("SELECT * FROM Spellen INNER JOIN Speler ON Speler.spelerID = Spellen.spelerNummer ");
            try (ResultSet rs = query.executeQuery()) {
                while (rs.next()) {
                    String spelNaam = rs.getString("spelNaam");
                    int spelers = rs.getInt("spelers");
                    
                    int spelerNummer = rs.getInt("spelerNummer");
                    String spelerNaam = rs.getString("naam");
                   

                    spellen.add(new Spel(spelNaam,spelers,spelerNummer));
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return spellen;
    }
    public void voegSpelToe(Spel spel) {

        try (Connection conn = DriverManager.getConnection(Connectie.JDBC_URL)) {
            PreparedStatement query = conn.prepareStatement("INSERT INTO Spellen (spelNaam, spelers, spelerNummer"
                    + "VALUES (?, ?, ?)");
            query.setString(1, spel.getSpelNaam());
            query.setInt(2, spel.getAantalSpelers());
            query.setInt(3, spel.getSpelerNummer());
            int executeUpdate = query.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}

