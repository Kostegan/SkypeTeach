package ru.teach.skype.types.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class DatabaseTeach {
    public static void main(String[] args) throws SQLException {
        // JDBC - java data base connectivity
        // JavaApp - Hibernate - JDBC - DB
        // ORM - Object-Relational mapping

        Connection connection = DriverManager.getConnection("jdbc:mysql//127.0.0.1/test_db", "kostya", "pass123");

        Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE users (id int primary key, name varchar(50) unique, )");

        List<User> users = new ArrayList<>();
        ResultSet rs = statement.executeQuery("SELECT id, name, age FROM users WHERE age>50");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");

            User user = new User();
            user.setId(id);

            users.add(user);
        }

        System.out.println(users);
    }

    private static class User {
        private int id;
        private String name;
        private int age;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}



