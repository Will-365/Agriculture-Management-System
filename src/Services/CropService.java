/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Crop;

/**
 *
 * @author user
 */
public interface CropService extends Remote{
     Crop saveCrop (Crop theCrop) throws RemoteException;
    Crop updateCrop (Crop theCrop) throws RemoteException;
    Crop deleteCrop (Crop theCrop) throws RemoteException;
    Crop searchCrop (Crop theCrop) throws RemoteException;
    List<Crop> findall() throws RemoteException;
    Crop findByName(String name) throws RemoteException;
}
