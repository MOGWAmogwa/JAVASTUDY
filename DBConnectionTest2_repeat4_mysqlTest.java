package com.fastcampus.ch3;
import junit.framework.TestCase;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;


// 🌹 이게 제일 왕깔끔하니까 공부할 때 이거보삼


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/root-context.xml")
public class DBConnectionTest2_repeat4_mysqlTest extends TestCase {
    @Autowired
    DataSource ds;

    public int insertUser(r1User user) throws Exception {



        Connection conn = ds.getConnection();
        String sql = "insert into user_info values(?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, user.getId());
        pstmt.setString(2, user.getPwd());
        pstmt.setString(3, user.getName());
        pstmt.setString(4, user.getEmail());
        pstmt.setDate(5, new Date(user.getBirth().getTime()));
        pstmt.setString(6, user.getSns());
        pstmt.setDate(7, new Date(user.getReg_date().getTime()));

        int rowCnt = pstmt.executeUpdate();
        return rowCnt;
    }

    @Test
    public void insertUserTest() throws Exception{
        deleteAll();
        r1User user = new r1User("testID", "5678", "KO-KILDONG", "kogildong42@naver.com", new java.util.Date(1996,4,2), "kakaotalk", new java.util.Date(2022,11,4));
        int rowCnt = insertUser(user);
        assertTrue(rowCnt == 1);
    }

    public int deleteUser(String id) throws Exception{

        Connection conn = ds.getConnection();
        String sql = "delete from user_info where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, id);
        int rowCnt = pstmt.executeUpdate();

        return rowCnt;
    }


    @Test
    public void deleteUserTest() throws Exception{
         deleteAll();
         r1User user = new r1User("testID", "5678", "KO-KILDONG", "kogildong42@naver.com", new java.util.Date(1996,4,2), "kakaotalk", new java.util.Date(2022,11,4));
         insertUser(user);
         int rowCnt = deleteUser("testID");
         assertTrue(rowCnt==1);

    }

    public r1User selectUser(String id) throws Exception{

        Connection conn = ds.getConnection();
        String sql = "select * from user_info where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();

        r1User user = new r1User();

        while(rs.next()){
            user.setId(rs.getString(1));
            user.setPwd(rs.getString(2));
            user.setName(rs.getString(3));
            user.setEmail(rs.getString(4));
            user.setBirth(rs.getDate(5));
            user.setSns(rs.getString(6));
            user.setReg_date(rs.getDate(7));
        }

        if(user != null){
            return user;
        }

        return null;



    }
    @Test
    public void selectUserTest() throws Exception{

        deleteAll();
        r1User user = new r1User("testID", "5678", "KO-KILDONG", "kogildong42@naver.com", new java.util.Date(1996,4,2), "kakaotalk", new java.util.Date(2022,11,4));
        insertUser(user);

        r1User user2 = selectUser("testID");

        assertTrue(user.equals(user2));


    }


    public int updateUser(r1User user) throws Exception{

        Connection conn = ds.getConnection();
        String sql = "update user_info set id = ? , pwd = ? , name = ? , email = ? , birth = ? , sns = ? , reg_date = ? where id = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, user.getId());
        pstmt.setString(2, user.getPwd());
        pstmt.setString(3, user.getName());
        pstmt.setString(4, user.getEmail());
        pstmt.setDate(5, new Date(user.getBirth().getTime()) );
        pstmt.setString(6,  user.getSns());
        pstmt.setDate(7, new Date(user.getReg_date().getTime()));
        pstmt.setString(8, user.getId());

        int rowCnt = pstmt.executeUpdate();
        return rowCnt;



    }

    @Test
    public void updateUserTest() throws Exception{

        deleteAll();
        r1User user = new r1User("testID", "5678", "KO-KILDONG", "kogildong42@naver.com", new java.util.Date(1996,4,2), "kakaotalk", new java.util.Date(2022,11,4));
        insertUser(user);

        r1User user2 = new r1User("testID", "5678", "KO-KILDONG", "cEamil@naver.com", new java.util.Date(1996,4,2), "kakaotalk", new java.util.Date(2022,11,4));
        int rowCnt = updateUser(user2);
        assertTrue(rowCnt == 1); // 행에 반영이 되었는지 확인

        r1User user2_ = selectUser(user.getId());

        assertTrue(user2_.equals(selectUser(user.getId())));

    }

    public void deleteAll () throws Exception{

        Connection conn = ds.getConnection();
        String sql = "delete from user_info";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.executeUpdate();

    }




}