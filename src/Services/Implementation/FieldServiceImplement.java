/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import Dao.FieldDao;
import Services.FieldService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Field;

/**
 *
 * @author user
 */
public class FieldServiceImplement  extends UnicastRemoteObject implements FieldService{

    public FieldServiceImplement() throws RemoteException{
    }
    FieldDao dao = new FieldDao();
    @Override
    public Field saveField(Field theField) throws RemoteException {
   return dao.registerField(theField);
    }

    @Override
    public Field updateField(Field theField) throws RemoteException {
        return dao.UpdateField(theField);
    }

    @Override
    public Field deleteField(Field theField) throws RemoteException {
return dao.DeleteField(theField);
    }

    @Override
    public Field searchField(Field theField) throws RemoteException {
return dao.findbyid(theField);
    }

    @Override
    public List<Field> findall() throws RemoteException {
return dao.retrieve();
    }
    
}
