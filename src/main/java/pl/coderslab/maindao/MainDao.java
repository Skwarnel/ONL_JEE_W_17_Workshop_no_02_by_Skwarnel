package pl.coderslab.maindao;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.util.Random;

public class MainDao {
    public static void main(String[] args) {
        //CREATE
        Random random = new Random();

        System.out.println("Hello :) we are testing DAO!");
        User user1 = new User();
        user1.setUserName("firstUserName");
        user1.setEmail("UserEmail" + random.nextInt() + "@gmail.com");
        user1.setPassword("firstUserDifficultPass&5%*" + random.nextDouble(10000));

        UserDao userDao1 = new UserDao();

        userDao1.create(user1);

        System.out.println(user1.getId());

        //READ
        UserDao userDao2 = new UserDao();
        userDao2.read(10);

        UserDao userDao3 = new UserDao();
        if (userDao3.read(98) == null) {
            System.out.println("działa!");
        } else {
            System.out.println("nie działa");
        }

        //UPDATE
        UserDao userDao4 = new UserDao();
        User user2 = userDao4.read(12);
        userDao4.update(user2);

        //DELETE
        UserDao userDao5 = new UserDao();
        userDao5.delete(13);

        //FIND_ALL
        UserDao userDao6 = new UserDao();
        userDao6.findAll();

    }

}