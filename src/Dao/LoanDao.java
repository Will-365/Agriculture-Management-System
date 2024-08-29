/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.Loan;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class LoanDao {
      public Loan registerLoan(Loan empobj){
      try {
        //create session
          Session ss= NewHibernateUtil.getSessionFactory().openSession();
      //create a transaction
          Transaction tr = ss.beginTransaction();
      //perform action
      ss.save(empobj);
    //commit transaction
      tr.commit();
      //close connection
      ss.close();
      
      } catch (Exception e) {e.printStackTrace();
           
  }
return null;
  }
public Loan UpdateLoan(Loan empobj){
      try {
        //create session
          Session ss= NewHibernateUtil.getSessionFactory().openSession();
      //create a transaction
          Transaction tr = ss.beginTransaction();
      //perform action
      ss.update(empobj);
    //commit transaction
      tr.commit();
      //close connection
      ss.close();
      
      } catch (Exception e) {e.printStackTrace();
           
  }
return null;
  }

  public Loan DeleteLoan(Loan empobj){
      try {
        //create session
          Session ss= NewHibernateUtil.getSessionFactory().openSession();
      //create a transaction
          Transaction tr = ss.beginTransaction();
      //perform action
      ss.delete(empobj);
    //commit transaction
      tr.commit();
      //close connection
      ss.close();
      
      } catch (Exception e) {e.printStackTrace();
           
  }
return null;
  }
public Loan findbyid (Loan empobj){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        Loan theemployee = (Loan) ss.get(Loan.class,empobj.getLoanId());
        ss.close();
    } catch (Exception e) {e.printStackTrace();;
    }
      return null;
} 

public List <Loan> retrieve(){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        List<Loan> employees = ss.createQuery("select Loan from Loan Loan").list();
    } catch (Exception e) {e.printStackTrace();
    }
      return null;


}
}
