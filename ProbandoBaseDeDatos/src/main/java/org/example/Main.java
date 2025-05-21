package org.example;

import com.sun.jdi.connect.spi.Connection;

import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection conexion;
        String url = "jdbc:mysql://ferramentas";
        try {
            conexion DriverManager.getConnection(url, "manuel", "4321");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}