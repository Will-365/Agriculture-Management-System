/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import Dao.PestManagementDao;
import Services.PestManagementService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.PestManagement;

/**
 *
 * @author user
 */
public class PestManagementServiceImplement  extends UnicastRemoteObject implements PestManagementService {

    public PestManagementServiceImplement() throws RemoteException{
    }
    PestManagementDao dao = new PestManagementDao();
    @Override
    public PestManagement savePestManagement(PestManagement thePestManagement) throws RemoteException {
    return dao.registerPestManagement(thePestManagement);
    }

    @Override
    public PestManagement updatePestManagement(PestManagement thePestManagement) throws RemoteException {
    return dao.UpdatePestManagement(thePestManagement);
    }

    @Override
    public PestManagement deletePestManagement(PestManagement thePestManagement) throws RemoteException {
    return dao.DeletePestManagement(thePestManagement);
    }

    @Override
    public PestManagement searchPestManagement(PestManagement thePestManagement) throws RemoteException {
    return dao.findbyid(thePestManagement);
    }

    @Override
    public List<PestManagement> findall() throws RemoteException {
    return dao.retrieve();
    }
    
}
