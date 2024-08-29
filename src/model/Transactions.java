/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

/**
 *
 * @author user
 */
@Entity
public class Transactions implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    
    private Double quantity;
    private Double price;
    private Date orderDate;
    private String status; // Pending, Completed, Canceled
    
    @ManyToOne
    @JoinColumn(name = "cropId", nullable = false)
    private Crop crop;
    
    @ManyToOne
    @JoinColumn(name = "buyerId", nullable = false)
    private User buyer;

    public Transactions() {
    }

    public Transactions(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Transactions(Long transactionId, Double quantity, Double price, Date orderDate, String status, Crop crop, User buyer) {
        this.transactionId = transactionId;
        this.quantity = quantity;
        this.price = price;
        this.orderDate = orderDate;
        this.status = status;
        this.crop = crop;
        this.buyer = buyer;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    
    
}
