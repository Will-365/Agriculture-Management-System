/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.Transactions;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class TransactionDao {
      public Transactions registerTransactions(Transactions transEmp){
      try {
        //create session
          Session ss= NewHibernateUtil.getSessionFactory().openSession();
      //create a transaction
          Transaction tr = ss.beginTransaction();
      //perform action
      ss.save(transEmp);
    //commit transaction
      tr.commit();
      //close connection
      ss.close();
      
      } catch (Exception e) {e.printStackTrace();
           
  }
return null;
  }
public Transactions UpdateTransactions(Transactions transEmp){
      try {
        //create session
          Session ss= NewHibernateUtil.getSessionFactory().openSession();
      //create a transaction
          Transaction tr = ss.beginTransaction();
      //perform action
      ss.update(transEmp);
    //commit transaction
      tr.commit();
      //close connection
      ss.close();
      
      } catch (Exception e) {e.printStackTrace();
           
  }
return null;
  }

  public Transactions DeleteTransactions(Transactions transEmp){
      try {
        //create session
          Session ss= NewHibernateUtil.getSessionFactory().openSession();
      //create a transaction
          Transaction tr = ss.beginTransaction();
      //perform action
      ss.delete(transEmp);
    //commit transaction
      tr.commit();
      //close connection
      ss.close();
      
      } catch (Exception e) {e.printStackTrace();
           
  }
return null;
  }
public Transactions findbyid (Transactions transEmp){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        Transactions theemployee = (Transactions) ss.get(Transactions.class,transEmp.getTransactionId());
        ss.close();
    } catch (Exception e) {e.printStackTrace();;
    }
      return null;
} 

public List <Transactions> retrieve(){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        List<Transactions> employees = ss.createQuery("select Transactions from Transactions Transactions").list();
    } catch (Exception e) {e.printStackTrace();
    }
      return null;


}
}
