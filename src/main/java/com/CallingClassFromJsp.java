package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CallingClassFromJsp {

    public static ArrayList<String> getArrayStudentName() throws SQLException {

        ArrayList<String> strings = new ArrayList<String>();
        //ConnectionToBd connectionToBd=new ConnectionToBd();
        //connectionToBd.myCreateConnection();
        Connection connection=null;
        //NamesToWeb namesToWeb=new NamesToWeb();
       // connection=namesToWeb.createConnection();
        ConnectionToBd connectionToBd=new ConnectionToBd();
        connection=connectionToBd.myCreateConnection();
        String script="Select * from studentsinweb";
        PreparedStatement pr=connection.prepareStatement(script);
        ResultSet rs=pr.executeQuery();
        while (rs.next()){
            strings.add(rs.getString(1));
        }
        strings.forEach(s -> System.out.println(s));
        return strings;
    }
}