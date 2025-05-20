package com.example.demo.jdbc;

import java.sql.*;

//1. db 커넥

//2. sql 실행

import java.sql.DriverManager;

//3. 결과
public class InsertJdbcExample {
    private static final String url ="jdbc:mysql://localhost:3306/test_db";
    private static final String username = "root";
    private static final String password = "root";
    public static void main(String[] args){
        try(
                Connection conn = DriverManager.getConnection(url, username,password);
                Statement statement =conn.createStatement();
                ){
                String insertSql = "INSERT INTO students (name, age, address) VALUES ('부상길', 70, '도동리')";
                int insert = statement.executeUpdate(insertSql);

                //int update = statement.executeUpdate("UPDATE students SET name = '양금명' WHERE name = '부상길'");

                //String deleteSql = "DELETE FROM students WHERE name = '양금명'";
                //int delete = statement.executeUpdate(deleteSql);
                ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

            while(resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("age"));
                System.out.println(resultSet.getString("address"));
            }

        }catch (SQLException e){
            System.out.println("SQL Exception: " + e.getMessage());
        }




    }
}
