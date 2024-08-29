/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author user
 */
@Entity
public class Loan implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;
    
    private Double amount;
    private Date applicationDate;
    private String status; // Pending, Approved, Rejected
    private Date approvalDate;
    
    @ManyToOne
    @JoinColumn(name = "farmerId", nullable = false)
    private User farmer;
    
    @ManyToOne
    @JoinColumn(name = "adminId")
    private User admin;

    public Loan() {
    }

    public Loan(Long loanId) {
        this.loanId = loanId;
    }

    public Loan(Long loanId, Double amount, Date applicationDate, String status, Date approvalDate, User farmer, User admin) {
        this.loanId = loanId;
        this.amount = amount;
        this.applicationDate = applicationDate;
        this.status = status;
        this.approvalDate = approvalDate;
        this.farmer = farmer;
        this.admin = admin;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public User getFarmer() {
        return farmer;
    }

    public void setFarmer(User farmer) {
        this.farmer = farmer;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }
    
}
