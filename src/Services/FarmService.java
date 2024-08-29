/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Farm;

/**
 *
 * @author user
 */
public interface FarmService extends Remote{
       Farm saveFarm (Farm theFarm) throws RemoteException;
    Farm updateFarm (Farm theFarm) throws RemoteException;
    Farm deleteFarm (Farm theFarm) throws RemoteException;
    Farm searchFarm (Farm theFarm) throws RemoteException;
    List<Farm> findall() throws RemoteException;
}
