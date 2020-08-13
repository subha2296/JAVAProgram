import java.sql.DriverManager;
import java.sql.SQLException;
public class connection {
    public static void main(String[] args) {

        String dburl = "jdbc:oracle:thin@localhost:1521:xe";
        String username = "PT0229";
        String password = "Profinch_123";

       /* try {
            connection Connection = DriverManager.getConnection(dburl, username, password);
            System.out.println("conncted to oracle");
        } catch (SQLException e) {
            System.out.println("opps");
            e.printStackTrace();
        }*/
    }
}