//package com.fastcampus.ch3;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class TransactionService_repeat1 {
//
//    @Autowired
//    A1Dao_repeat2 a1dao;
//    @Transactional(rollbackFor = Exception.class)
//    public void insertA1WithTx() throws Exception {
//        a1dao.insert(1,100);
//        a1dao.insert(1,200);
//    }
//
//
//}
