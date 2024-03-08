import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private Connection connection;

    public DatabaseManager() {
        connect();
    }

    private void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:coffeeshop.db");
            System.out.println("Connected to SQLite database.");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // Methods for database operations
    // For simplicity, you can add methods for CRUD operations here
    // For example:
    // public void insertOrder(Order order) { ... }
    // public void updateInventory(Inventory inventory) { ... }
    // public ArrayList<Employee> getAllEmployees() { ... }
    // and so on...

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Connection to SQLite database closed.");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
