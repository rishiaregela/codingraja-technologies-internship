import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem", "root", "02092002t");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        return con;
    }
}
