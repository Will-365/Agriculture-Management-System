/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Field;

/**
 *
 * @author user
 */
public interface FieldService extends Remote{
       Field saveField (Field theField) throws RemoteException;
    Field updateField (Field theField) throws RemoteException;
    Field deleteField (Field theField) throws RemoteException;
    Field searchField (Field theField) throws RemoteException;
    List<Field> findall() throws RemoteException;
    
}
