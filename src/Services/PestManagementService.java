/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.PestManagement;

/**
 *
 * @author user
 */
public interface PestManagementService extends Remote{   PestManagement savePestManagement (PestManagement thePestManagement) throws RemoteException;
    PestManagement updatePestManagement (PestManagement thePestManagement) throws RemoteException;
    PestManagement deletePestManagement (PestManagement thePestManagement) throws RemoteException;
    PestManagement searchPestManagement (PestManagement thePestManagement) throws RemoteException;
    List<PestManagement> findall() throws RemoteException;
    
}
