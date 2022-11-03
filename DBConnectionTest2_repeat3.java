//package com.fastcampus.ch3;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//
//public class DBConnectionTest2_repeat3 {
//
//
//    public static void main(String[] args) throws  Exception{
//        // DataSource를 annotation을 쓰지 않고 직접 가져오는 방법
//
//        ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
//        DataSource ds = ac.getBean(DataSource.class);
//
//        Connection conn = ds.getConnection();
//
//        System.out.println("conn = " + conn);
//
//    }
//
//
//
//
//}
