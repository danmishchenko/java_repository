package edu.dp.sau.danmishchenko.lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:h2:~/test";
        String userName = "sa";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}