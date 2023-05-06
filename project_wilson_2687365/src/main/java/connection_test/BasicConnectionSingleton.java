package connection_test;

import java.sql.*;

public class BasicConnectionSingleton {
    private static String url =
            "jdbc:mysql://localhost:3306/registro?serverTimezone=America/Bogota";

    private static String user = "wilson";
    private static String pass = "wilson1234";
    private static Connection conn;
    public static Connection getInstance()
            throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user,pass);
        }
        return conn;
    }
} // BasicConnectionSingleton
