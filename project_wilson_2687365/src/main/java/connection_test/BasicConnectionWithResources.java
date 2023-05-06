package connection_test;
import java.sql.*;
public class BasicConnectionWithResources
    {
        public static void main(String[] args){
            String url = "jdbc:mysql://localhost:3306/registro?serverTimezone=America/Bogota";
            String username = "wilson";
            String password = "wilson1234";
            String sql = "SELECT * FROM registro.users_tbl";
            try (Connection conn = DriverManager.getConnection(url, username, password);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    System.out.println("CONEXION BASE DE DATOS BasicConnectionWithResources");
                    System.out.print(rs.getString("user_firstname"));
                    System.out.print(" | ");
                    System.out.print(rs.getString("user_lastname"));
                    System.out.print(" | ");
                    System.out.print(rs.getString("user_email"));
                    System.out.print(" | ");
                    System.out.print(rs.getString("user_password"));
                    System.out.println();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } // end try-catch
        } // main
    } // BasicConnectionWithResources

