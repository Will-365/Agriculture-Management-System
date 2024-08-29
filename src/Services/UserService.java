/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.User;

/**
 *
 * @author user
 */
public interface UserService extends Remote{
       User saveUser (User theUser) throws RemoteException;
    User updateUser (User theUser) throws RemoteException;
    User deleteUser (User theUser) throws RemoteException;
    User searchUser (User theUser) throws RemoteException;
    boolean authenticateUser (String username, String password) throws RemoteException;
    boolean resetpassword(String username, String newpassword)throws RemoteException;
    List<User> findall() throws RemoteException;
    
}
