package food_ordering_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionManager {
private static String url = "jdbc:mysql://localhost:3306/food_db";
private static String driverName = "com.mysql.jdbc.Driver";
private static String username = "root";
private static String password = "manvitha@2004";
private static Connection con;
public static Connection getConnection() {
try {
con = DriverManager.getConnection(url, username, password);
} catch (SQLException ex) {
System.out.println(ex);
}
return con;
}
}
