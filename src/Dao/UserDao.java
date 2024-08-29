/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import static com.mchange.v2.c3p0.impl.C3P0Defaults.password;
import java.util.List;
import model.User;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class UserDao {
      public User registerUser(User empobj){
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
public User UpdateUser(User empobj){
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

  public User DeleteUser(User empobj){
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
public User findbyid (User empobj){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        User theemployee = (User) ss.get(User.class,empobj.getUserId());
        ss.close();
    } catch (Exception e) {e.printStackTrace();;
    }
      return null;
} 

public List <User> retrieve(){
    try {
        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        List<User> employees = ss.createQuery("select User from User User").list();
    } catch (Exception e) {e.printStackTrace();
    }
      return null;
}
public boolean authenticateUser(String Username, String Password) {
    Session session = null;
    Transaction transaction = null;
    try {
        session = NewHibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        
        // Query to find the user by username
        Query query = session.createQuery("from User where username = :Username");
        query.setParameter("Username", Username);
        User user = (User) query.uniqueResult();

        transaction.commit();
        
        // Debugging output to verify user retrieval
        if (user == null) {
            System.out.println("User not found: " + Username);
            return false;
        } else {
            System.out.println("User found: " + user.getUsername());
            // Check if the provided password matches the stored password
            boolean passwordMatch = user.getPassword().equals(Password);
            System.out.println("Password match: " + passwordMatch);
            return passwordMatch;
        }
    } catch (Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        e.printStackTrace();
        return false;
    } finally {
        if (session != null) {
            session.close();
        }
    }
}

public boolean resetpassword(String Username, String newpassword){

    try {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
      Transaction transaction = session.beginTransaction();
         Query query = session.createQuery("from User where Username =: Username");
         query.setParameter("Username", Username);
      User user =(User) query.uniqueResult();
      if (user != null){
      user.setPassword(newpassword);
      session.update(user);
      transaction.commit();
      session.close();
      return true;
      }else{
      return true;
      }
    } catch (Exception e) {e.printStackTrace();
    }
return false;

}
}
