package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.dropUsersTable();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Caba", "Makarov", (byte)35);
        userDaoJDBC.saveUser("Вова", "Егоров", (byte)65);
        userDaoJDBC.saveUser("Петя", "Кукушкин", (byte)78);
        List user = userDaoJDBC.getAllUsers();
        System.out.println(user);

        // реализуйте алгоритм здесь
    }
}
