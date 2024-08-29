/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Loan;

/**
 *
 * @author user
 */
public interface LoanService extends Remote{
       Loan saveLoan (Loan theLoan) throws RemoteException;
    Loan updateLoan (Loan theLoan) throws RemoteException;
    Loan deleteLoan (Loan theLoan) throws RemoteException;
    Loan searchLoan (Loan theLoan) throws RemoteException;
    List<Loan> findall() throws RemoteException;
}
