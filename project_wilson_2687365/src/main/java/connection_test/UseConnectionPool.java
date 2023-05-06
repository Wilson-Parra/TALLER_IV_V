package connection_test;
import java.sql.*;
public class UseConnectionPool {
    private static Connection getConnection() throws SQLException {
        return ConnectionPool.getConnection();}
    public static void main(String[] args) throws SQLException {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM registro.users_tbl")) {
            while (rs.next()) {
                System.out.println("CONEXION BASE DE DATOS ConnectionPool");
                System.out.print(rs.getString("user_firstname"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_lastname"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_email"));
                System.out.print(" | ");
                System.out.print(rs.getString("user_password"));
                System.out.println();
            }
        }
    }
}  // UseConnectionPool
