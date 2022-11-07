//package com.fastcampus.ch3;
//
//import java.sql.*;
//
//public class DBConnectionTest_repeat2 {
//
//    public static void main(String[] args) throws Exception {
//
//        // 스키마의 이름이 다를 경우에는 이름을 다르게 써주어야 한다요
//
//        String DB_URL = "jdbc:mysql://localhost:3306/springbasic?useUnicode=true&characterEncoding=utf8";
//        String DB_USER = "bina";
//        String DB_PASSWORD = "1234";
//
//        Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
//        Statement stmt = conn.createStatement();
//
//        String query = "Select now()";
//        ResultSet rs = stmt.executeQuery(query);
//
//        while(rs.next()){
//            String curDate = rs.getString(1);
//            System.out.println("curDate = " + curDate);
//        }
//
//
//
//
//
//
//
//    }
//
//}
