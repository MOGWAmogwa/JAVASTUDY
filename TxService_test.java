//package com.fastcampus.ch3;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.TransactionDefinition;
//import org.springframework.transaction.TransactionStatus;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.support.DefaultTransactionDefinition;
//
//import javax.sql.DataSource;
//
//@Service
//public class TxService_test {
//
//    @Autowired
//    A1Dao_tx_test a1dao;
//
//    @Autowired
//    B1Dao_tx_test b1dao;
//
//    @Autowired
//    DataSource ds;
//
////    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
//    public void insertA1WithTx() throws Exception{
//
//        PlatformTransactionManager tm = new DataSourceTransactionManager(ds);
//        DefaultTransactionDefinition txd = new DefaultTransactionDefinition();
//        txd.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
//        TransactionStatus status = tm.getTransaction(txd);
//
//        try {
//            a1dao.insert(1, 100);
//            insertB1WithTx();
//            a1dao.insert(2, 100);
//            tm.commit(status);
//        } catch (Exception e) {
//            e.printStackTrace();
//            tm.rollback(status);
//        } finally {
//        }
//    }
//
//    //@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
//    public void insertB1WithTx() throws Exception{
//
//        PlatformTransactionManager tm = new DataSourceTransactionManager(ds);
//        DefaultTransactionDefinition txd = new DefaultTransactionDefinition();
//        txd.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
//        TransactionStatus status = tm.getTransaction(txd);
//
//        try {
//            b1dao.insert(1, 100);
//            b1dao.insert(1, 200);
//            tm.commit(status);
//        } catch (Exception e) {
//            e.printStackTrace();
//            tm.rollback(status);
//        } finally {
//        }
//    }
//
//
//}
