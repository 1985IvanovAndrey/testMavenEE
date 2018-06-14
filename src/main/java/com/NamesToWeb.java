package com;

import java.sql.*;
import java.util.ArrayList;

public class NamesToWeb {

    private static String url = "jdbc:postgresql://localhost:5432/bdtest";
    private static String driverName = "org.postgresql.Driver";
    private static String username = "postgres";
    private static String password = "postgres";
    private static java.sql.Connection connection;

    public  ArrayList<String> getArrayStudentName() throws SQLException {
        connection = createConnection();
        ArrayList<String> strings = new ArrayList<String>();
        PreparedStatement ps2 = connection.prepareStatement("SELECT * FROM studentsinweb");
        ResultSet rs2 = ps2.executeQuery();
        while (rs2.next()) {
            strings.add(rs2.getString(1));
        }
        ///strings.forEach(s -> System.out.println(s));
        return strings;
    }
    public  Connection createConnection() {
        connection = null;
        System.out.println("-------- PostgreSQL JDBC ConnectionToPostgreSQL Testing ------------");
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? Include in your library path!");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ConnectionToPostgreSQL Failed! Check output console");
            e.printStackTrace();
        }
        System.out.println("PostgreSQL JDBC Driver Registered!");
        return connection;
    }
}



