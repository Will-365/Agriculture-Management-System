/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.Field;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class FieldDao {
     public Field registerField(Field empobj){
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
public Field UpdateField(Field empobj){
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

  public Field DeleteField(Field empobj){
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
public Field findbyid (Field empobj){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        Field theemployee = (Field) ss.get(Field.class,empobj.getFieldId());
        ss.close();
    } catch (Exception e) {e.printStackTrace();;
    }
      return null;
} 

public List <Field> retrieve(){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        List<Field> employees = ss.createQuery("select Field from Field Field").list();
    } catch (Exception e) {e.printStackTrace();
    }
      return null;


} 
}
