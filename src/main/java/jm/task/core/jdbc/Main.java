package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

//        System.out.println(Util.getSessionFactory());
        userService.createUsersTable();
        userService.saveUser("Петр", "Петров", (byte) 30);
        userService.saveUser("Иван", "Иванов", (byte) 31);
        userService.saveUser("Макар", "Макаров", (byte) 32);
        userService.saveUser("Сидор", "Сидоров", (byte) 33);
        userService.removeUserById(2);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();


//        System.out.println(Util.getSessionFactory());
//        System.out.println(userDaoJDBC.getUser(2));
//        userDaoJDBC.createUsersTable();
//        userDaoJDBC.saveUser("Петр", "Петров", (byte) 30);
//        userDaoJDBC.saveUser("Иван", "Иванов", (byte) 31);
//        userDaoJDBC.saveUser("Макар", "Макаров", (byte) 32);
//        userDaoJDBC.saveUser("Сидор", "Сидоров", (byte) 33);
//        System.out.println(userDaoJDBC.getAllUsers());
//        userDaoJDBC.cleanUsersTable();
//        userDaoJDBC.dropUsersTable();
        // реализуйте алгоритм здесь
    }
}
