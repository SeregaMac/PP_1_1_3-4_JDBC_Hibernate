package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String DB_URL = "jdbc:mysql://localhost:3306";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "Lesnica20122012";

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection OK");

        } catch ( SQLException e) {
            e.printStackTrace();
            System.out.println("Connection ERROR");
        }
        System.out.println("Удачно");
        return connection;
    }
    // реализуйте настройку соеденения с БД
}

