package app.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

    private static final String dbURL = "jdbc:mysql://localhost:3306/blogdb"+
            "?verifyServerCertificate=false"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC";
    private static final String dbUser = "root";
    private static final String dbPassword = "root";



    public static Connection getDBConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
