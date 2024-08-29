/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Transactions;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public interface TransactionService extends Remote{
       Transactions saveTransaction (Transactions theTransactions) throws RemoteException;
    Transactions updateTransaction (Transactions theTransactions) throws RemoteException;
    Transactions deleteTransaction (Transactions theTransactions) throws RemoteException;
    Transactions searchTransaction (Transactions theTransactions) throws RemoteException;
    List<Transactions> findall() throws RemoteException;
}
