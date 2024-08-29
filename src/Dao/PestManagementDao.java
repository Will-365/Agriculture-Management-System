/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.PestManagement;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class PestManagementDao  {
      public PestManagement registerPestManagement(PestManagement empobj){
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
public PestManagement UpdatePestManagement(PestManagement empobj){
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

  public PestManagement DeletePestManagement(PestManagement empobj){
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
public PestManagement findbyid (PestManagement empobj){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        PestManagement theemployee = (PestManagement) ss.get(PestManagement.class,empobj.getPestManagementId());
        ss.close();
    } catch (Exception e) {e.printStackTrace();;
    }
      return null;
} 

public List <PestManagement> retrieve(){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        List<PestManagement> employees = ss.createQuery("select PestManagement from PestManagement PestManagement").list();
    } catch (Exception e) {e.printStackTrace();
    }
      return null;


}
}
