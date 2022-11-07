//package com.fastcampus.ch3;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.datasource.DataSourceUtils;
//import org.springframework.stereotype.Repository;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//@Repository
//public class A1Dao_repeat1 {
//
//    @Autowired
//    DataSource ds;
//
//
//    public int insert(int key , int value) throws Exception {
//
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        String sql = "insert into a1 values(?,?)";
//
//        try {
//
////            conn = ds.getConnection();
//            conn = DataSourceUtils.getConnection(ds);
//            pstmt = conn.prepareStatement(sql);
//            System.out.println("conn = " + conn);
//            pstmt.setInt(1, key);
//            pstmt.setInt(2, value);
//
//            return pstmt.executeUpdate();
//
//
//
//        }catch(SQLException e){
//            e.printStackTrace();
//            throw e;
//
//        }finally {
//            close(pstmt);
//            DataSourceUtils.releaseConnection(conn,ds);
//
//        }
//
//
//
//
//    }
//
//    public int deleteAll() throws Exception{
//
//        Connection conn = ds.getConnection();
//        String sql = "delete from a1";
//        PreparedStatement pstmt = conn.prepareStatement(sql);
//
//        return pstmt.executeUpdate();
//
//    }
//
//    private void close(AutoCloseable... acs) {
//
//        try {
//            for(AutoCloseable ac : acs){
//                ac.close();
//            }
//
//
//        }catch(Exception e){
//            e.printStackTrace();
//
//
//        }
//    }
//
//}
