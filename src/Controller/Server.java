/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Services.FieldService;
import Services.Implementation.CropServiceImplement;
import Services.Implementation.FarmServiceImplement;
import Services.Implementation.FieldServiceImplement;
import Services.Implementation.LoanServiceImplement;
import Services.Implementation.PestManagementServiceImplement;
import Services.Implementation.TransactionServiceImplement;
import Services.Implementation.UserServiceImplement;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author user
 */
public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            Registry theRegistry = LocateRegistry.createRegistry(6000);
            theRegistry.rebind("crop",new CropServiceImplement());
            theRegistry.rebind("farm", new FarmServiceImplement());
            theRegistry.rebind("field",new FieldServiceImplement());
            theRegistry.rebind("loan",new LoanServiceImplement());
            theRegistry.rebind("pestmgt", new PestManagementServiceImplement());
            theRegistry.rebind("transactiomn", new TransactionServiceImplement());
            theRegistry.rebind("user", new UserServiceImplement());
            System.out.println("server is running on port 6000");
        } catch (Exception e) {e.printStackTrace();
        }
    }

}
    

