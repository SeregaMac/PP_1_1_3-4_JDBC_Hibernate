package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    private String sql = "INSERT INTO ADDRESS (ID, NAME , LAST_NAME, AGE) VALUES (?, ?, ?, ?)";

    public UserDaoJDBCImpl() {
    }

    public void createUsersTable() {
        try( Connection connection = Util.getConnection(); Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE users (id INT(5) PRIMARY KEY NOT NULL AUTO_INCREMENT," +
                    " name VARCHAR(50), lastName VARCHAR(50), age INT (5));");
            System.out.println("Таблица создана");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropUsersTable() {
        try( Connection connection = Util.getConnection(); Statement statement = connection.createStatement()) {
            statement.executeUpdate("DROP TABLE users");
            System.out.println("Таблица удалена");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveUser(String name, String lastName, byte age) {
        try( Connection connection = Util.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
