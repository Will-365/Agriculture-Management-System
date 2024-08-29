/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import Dao.FarmDao;
import Services.FarmService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Farm;

/**
 *
 * @author user
 */
public class FarmServiceImplement  extends UnicastRemoteObject implements FarmService{

    public FarmServiceImplement() throws RemoteException{
    }
    FarmDao dao = new FarmDao();
    @Override
    public Farm saveFarm(Farm theFarm) throws RemoteException {
return dao.registerFarm(theFarm);
    }

    @Override
    public Farm updateFarm(Farm theFarm) throws RemoteException {
return dao.UpdateFarm(theFarm);
    }

    @Override
    public Farm deleteFarm(Farm theFarm) throws RemoteException {
return dao.DeleteFarm(theFarm);
    }

    @Override
    public Farm searchFarm(Farm theFarm) throws RemoteException {
return dao.findbyid(theFarm);
    }

    @Override
    public List<Farm> findall() throws RemoteException {
return dao.retrieve();
    }
    
}
