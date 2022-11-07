//package com.fastcampus.ch3;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.sql.DataSource;
//import java.sql.*;
//
//@Repository
//public class UserDaoimple_n_repeat1 implements UserDao_n_repeat1 {
//
//    final int FAIL = 0;
//    @Autowired
//    DataSource ds;
//
//    @Override
//    public int insertUser(r1User user) {
//
//        int rowCnt = FAIL;
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//
//        String sql = "insert into user_info values(?,?,?,?,?,?,?)";
//
//
//        try {
//
//            conn = ds.getConnection();
//            pstmt = conn.prepareStatement(sql);
//
//            pstmt.setString(1, user.getId());
//            pstmt.setString(2, user.getPwd());
//            pstmt.setString(3, user.getName());
//            pstmt.setString(4, user.getEmail());
//            pstmt.setDate(5, new Date(user.getBirth().getTime()));
//            pstmt.setString(6, user.getSns());
//            pstmt.setDate(7, new Date(user.getReg_date().getTime()));
//
//            rowCnt = pstmt.executeUpdate();
//            return rowCnt;
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return FAIL;
//        } finally {
//            close(pstmt, conn);
//        }
//
//    }
//
//
//    @Override
//    public int deleteUser(String id) {
//
//        int rowCnt = FAIL;
//
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//
//        String sql = "delete from user_info where id = ?";
//
//
//        try {
//            conn = ds.getConnection();
//            pstmt = conn.prepareStatement(sql);
//
//            pstmt.setString(1, id);
//
//            rowCnt = pstmt.executeUpdate();
//            return rowCnt;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return FAIL;
//        } finally {
//            close(pstmt, conn);
//        }
//
//
//    }
//
//
//    @Override
//    public int updateUser(r1User user) {
//
//        int rowCnt = FAIL;
//
//        String sql = "update user_info set id = ? , pwd = ? , name = ? , email = ? , birth = ? , sns = ? , reg_date = ? where id = ?";
//
//
//        try(
//                Connection conn = ds.getConnection();
//                         PreparedStatement pstmt = conn.prepareStatement(sql);
//        ) {
//            pstmt.setString(1, user.getId());
//            pstmt.setString(2, user.getPwd());
//            pstmt.setString(3, user.getName());
//            pstmt.setString(4, user.getEmail());
//            pstmt.setDate(5, new Date(user.getBirth().getTime()));
//            pstmt.setString(6, user.getSns());
//            pstmt.setDate(7, new Date(user.getReg_date().getTime()));
//            pstmt.setString(8, user.getId());
//
//            rowCnt = pstmt.executeUpdate();
//            return rowCnt;
//
//        } catch(SQLException e){
//            e.printStackTrace();
//            return FAIL;
//        }
//
//}
//
//
//    @Override
//    public r1User selectUser(String id) {
//
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//
//        String sql = "select * from user_info where id = ?";
//
//
//        try {
//
//            conn = ds.getConnection();
//            pstmt = conn.prepareStatement(sql);
//
//            pstmt.setString(1, id);
//
//            rs = pstmt.executeQuery();
//
//            r1User user = new r1User();
//
//            while(rs.next()){
//
//                user.setId(rs.getString(1));
//                user.setPwd(rs.getString(2));
//                user.setName(rs.getString(3));
//                user.setEmail(rs.getString(4));
//                user.setBirth(rs.getDate(5));
//                user.setSns(rs.getString(6));
//                user.setReg_date(rs.getDate(7));
//            }
//
//            return user;
//
//        } catch (SQLException e) {
//                e.printStackTrace();
//                return null;
//        } finally {
//
//            close(rs, pstmt, conn);
//        }
//
//
//    }
//
//    public void deleteAll() throws Exception{
//
//        Connection conn = ds.getConnection();
//        String sql = "delete from user_info";
//        PreparedStatement pstmt = conn.prepareStatement(sql);
//
//        pstmt.executeUpdate();
//    }
//
//
//
//    private void close(AutoCloseable... acs) {
//
//        try {
//            for (AutoCloseable ac : acs) {
//                ac.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//
//}
