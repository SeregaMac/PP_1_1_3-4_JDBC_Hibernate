package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/basa";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Lesnica20122012";

    public static Connection getConnection() throws SQLException{
        Connection connection;
        connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        return connection;
    }
    // реализуйте настройку соеденения с БД
}

