//package com.fastcampus.ch3;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class TransactionService {
//
//    @Autowired
//    A1Dao a1Dao;
//
//    @Autowired
//    B1Dao b1Dao;
//
//
//    public void insertA1WithoutTx() throws Exception{
//        a1Dao.insert(1,100);
//        a1Dao.insert(1,200);
//    }
//
//    @Transactional(rollbackFor = Exception.class) // aop  가 알아서 위아래로 commit() 이랑  rollback을 주입해줌 // 이렇게 해야  Exception 을  Rollback
//    // @Transactional // RuntimeException Error만 rollback
//    public void insertA1WithTx() throws Exception{
//        a1Dao.insert(1,100);
//        a1Dao.insert(1,200);
//    }
//
//    @Transactional // aop  가 알아서 위아래로 commit() 이랑  rollback을 주입해줌
//    public void insertA1WithSuccessTx() throws Exception{
//        a1Dao.insert(1,100);
//        a1Dao.insert(2,200);
//    }
//
//}
