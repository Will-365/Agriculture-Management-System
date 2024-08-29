/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import Dao.UserDao;
import Services.UserService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.User;

/**
 *
 * @author user
 */
public class UserServiceImplement  extends UnicastRemoteObject implements UserService{

    public UserServiceImplement() throws RemoteException {
    }
    UserDao dao = new UserDao();
    @Override
    public User saveUser(User theUser) throws RemoteException {
    return dao.registerUser(theUser);
    }

    @Override
    public User updateUser(User theUser) throws RemoteException {
    return dao.UpdateUser(theUser);
    }

    @Override
    public User deleteUser(User theUser) throws RemoteException {
    return dao.DeleteUser(theUser);
    }

    @Override
    public User searchUser(User theUser) throws RemoteException {
    return dao.findbyid(theUser);
    }

    @Override
    public List<User> findall() throws RemoteException {
    return dao.retrieve();
    }

    @Override
    public boolean authenticateUser(String username, String password) throws RemoteException {
return dao.authenticateUser(username, password);
        }

    @Override
    public boolean resetpassword(String username, String newpassword) throws RemoteException {
return dao.resetpassword(username, newpassword);
        }
    
}
