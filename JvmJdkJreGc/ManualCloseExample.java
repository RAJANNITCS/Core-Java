import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManualCloseExample {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            System.out.println("Database connection established.");
            // Do database operations
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close(); // Ensure connection is closed
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}