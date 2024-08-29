/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.Crop;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class CropDao {
    public Crop registerCrop(Crop empobj){
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
public Crop UpdateCrop(Crop empobj){
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

  public Crop DeleteCrop(Crop empobj){
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
public Crop findbyid (Crop empobj){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        Crop theemployee = (Crop) ss.get(Crop.class,empobj.getCropId());
        ss.close();
        return theemployee;
    } catch (Exception e) {e.printStackTrace();;
    }
      return null;
} 

public List <Crop> retrieve(){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        List<Crop> employees = ss.createQuery("select crop from Crop crop").list();
        ss.close();
        return employees;
    } catch (Exception e) {e.printStackTrace();
   
    }
      return null;


}
public Crop findByName(String name) {
    try {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Crop WHERE name = :name");
        query.setParameter("name", name);
        Crop crop = (Crop) query.uniqueResult();
        session.close();
        return crop;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}


}