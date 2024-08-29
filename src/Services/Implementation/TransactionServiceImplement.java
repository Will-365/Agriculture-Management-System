/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import Dao.TransactionDao;
import Services.TransactionService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Transactions;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class TransactionServiceImplement  extends UnicastRemoteObject implements TransactionService {

    public TransactionServiceImplement() throws RemoteException{
    }
    TransactionDao dao = new TransactionDao();

    @Override
    public Transactions saveTransaction(Transactions theTransactions) throws RemoteException {
     return dao.registerTransactions(theTransactions);
    }

    @Override
    public Transactions updateTransaction(Transactions theTransactions) throws RemoteException {
    return dao.UpdateTransactions(theTransactions);
    }

    @Override
    public Transactions deleteTransaction(Transactions theTransactions) throws RemoteException {
    return dao.DeleteTransactions(theTransactions);
    }

    @Override
    public Transactions searchTransaction(Transactions theTransactions) throws RemoteException {
     return dao.findbyid(theTransactions);
    }

    @Override
    public List<Transactions> findall() throws RemoteException {
     return dao.retrieve();
    }

     
}
