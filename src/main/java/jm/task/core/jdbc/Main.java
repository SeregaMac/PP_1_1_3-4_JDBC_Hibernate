package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        System.out.println(Util.getSessionFactory());
        userService.createUsersTable();
        userService.saveUser("Петр", "Петров", (byte) 30);
        userService.saveUser("Иван", "Иванов", (byte) 31);
        userService.saveUser("Макар", "Макаров", (byte) 32);
        userService.saveUser("Сидор", "Сидоров", (byte) 33);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
        // реализуйте алгоритм здесь
    }
}
