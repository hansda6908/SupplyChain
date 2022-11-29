package com.example.supplychain;

import java.sql.*;


public class DatabaseConnection {
    String SQLURL ="jdbc:mysql://localhost:3306/supplyChain?useSSL=false";
    String userName = "root";
    String password = "zayinashish69081";

    Connection con = null;
    DatabaseConnection(){
        try {

            con = DriverManager.getConnection(SQLURL, userName, password);
            if(con != null){
                System.out.println("OUR CONNECTION IS SUCCESSFUL");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // This executeQuery is used to run the query which gives result like select cmd
    // that returns the tabular the data
    public ResultSet executeQuery(String query){
        ResultSet res = null;
        try{
            Statement statement = con.createStatement();
            res = statement.executeQuery(query);
            return res;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }

    // executeUpdate is used in to show Insert , delete ,update statement
    public int executeUpdate(String query) {
        int res = 0;
        try{
            Statement statement = con.createStatement();
            res = statement.executeUpdate(query);
            return res;

        }
        catch (Exception e){
            e.printStackTrace();
        }

        return res;
    }
}
