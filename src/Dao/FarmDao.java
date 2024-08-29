/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.Farm;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class FarmDao {
    public Farm registerFarm(Farm empobj){
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
public Farm UpdateFarm(Farm empobj){
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

  public Farm DeleteFarm(Farm empobj){
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
public Farm findbyid (Farm empobj){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        Farm theemployee = (Farm) ss.get(Farm.class,empobj.getFarmId());
        ss.close();
    } catch (Exception e) {e.printStackTrace();;
    }
      return null;
} 

public List <Farm> retrieve(){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        List<Farm> employees = ss.createQuery("select Farm from Farm Farm").list();
    } catch (Exception e) {e.printStackTrace();
    }
      return null;


}
}
