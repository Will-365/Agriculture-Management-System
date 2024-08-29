/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import Dao.LoanDao;
import Services.LoanService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Loan;

/**
 *
 * @author user
 */
public class LoanServiceImplement  extends UnicastRemoteObject implements LoanService{

    public LoanServiceImplement() throws RemoteException{
    }
LoanDao dao = new LoanDao();
    @Override
    public Loan saveLoan(Loan theLoan) throws RemoteException {
    return dao.registerLoan(theLoan);
    }

    @Override
    public Loan updateLoan(Loan theLoan) throws RemoteException {
     return dao.UpdateLoan(theLoan);
    }

    @Override
    public Loan deleteLoan(Loan theLoan) throws RemoteException {
    return dao.DeleteLoan(theLoan);
    }

    @Override
    public Loan searchLoan(Loan theLoan) throws RemoteException {
    return dao.findbyid(theLoan);
    }

    @Override
    public List<Loan> findall() throws RemoteException {
     return dao.retrieve();
    }
    
}
