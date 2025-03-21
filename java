import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCXamppConnection {
    public static void main(String[] args) {
        // Database URL (XAMPP's MySQL default host and port)
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace 'testdb' with your database name
        String user = "root";  // Default XAMPP username
        String password = "";  // Default XAMPP password (empty by default)

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL via XAMPP!");

            // Creating a Statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users"; // Replace 'users' with your table name
            ResultSet rs = stmt.executeQuery(sql);

            // Process ResultSet
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
