package com.fastcampus.ch3;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class UserDaoimple_nTest extends TestCase {

    @Autowired
    UserDaoimple_n userDao;

    public void testInsertUser() {
    }

    public void testDeleteUser() {
    }

    public void testSelectUser() {
    }
    @Test
    public void testUpdateUser() throws Exception {

        userDao.deleteAll();
        r1User user = new r1User("testID", "5678", "KO-KILDONG", "kogildong42@naver.com", new java.util.Date(1996,4,2), "kakaotalk", new java.util.Date(2022,11,4));
        userDao.insertUser(user);

        r1User user2 = new r1User("testID", "5678", "KO-KILDONG", "cEamil@naver.com", new java.util.Date(1996,4,2), "kakaotalk", new java.util.Date(2022,11,4));
        int rowCnt = userDao.updateUser(user2);
        assertTrue(rowCnt == 1); // 행에 반영이 되었는지 확인

        r1User user2_ = userDao.selectUser(user.getId());

        assertTrue(user2_.equals(userDao.selectUser(user.getId())));


    }


}