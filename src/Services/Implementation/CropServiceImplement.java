/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import Dao.CropDao;
import Services.CropService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Crop;

/**
 *
 * @author user
 */
public class CropServiceImplement  extends UnicastRemoteObject implements CropService{

    public CropServiceImplement() throws RemoteException{
    }
     CropDao dao = new CropDao();
    @Override
    public Crop saveCrop(Crop theCrop) throws RemoteException {
     return dao.registerCrop(theCrop);
    }

    @Override
    public Crop updateCrop(Crop theCrop) throws RemoteException {
    return dao.UpdateCrop(theCrop);
    }

    @Override
    public Crop deleteCrop(Crop theCrop) throws RemoteException {
return dao.DeleteCrop(theCrop);
    }

    @Override
    public Crop searchCrop(Crop theCrop) throws RemoteException {
return dao.findbyid(theCrop);
    }

    @Override
    public List<Crop> findall() throws RemoteException {
return dao.retrieve();
    }

    @Override
    public Crop findByName(String name) throws RemoteException {
return dao.findByName(name);
    }
    
}
