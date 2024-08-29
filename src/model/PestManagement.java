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
public class PestManagement implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pestManagementId;
    
    private String pestType;
    private String treatment;
    private Date date;
    
    @ManyToOne
    @JoinColumn(name = "fieldId", nullable = false)
    private Field field;

    public PestManagement() {
    }

    public PestManagement(Long pestManagementId) {
        this.pestManagementId = pestManagementId;
    }

    public PestManagement(Long pestManagementId, String pestType, String treatment, Date date, Field field) {
        this.pestManagementId = pestManagementId;
        this.pestType = pestType;
        this.treatment = treatment;
        this.date = date;
        this.field = field;
    }

    public Long getPestManagementId() {
        return pestManagementId;
    }

    public void setPestManagementId(Long pestManagementId) {
        this.pestManagementId = pestManagementId;
    }

    public String getPestType() {
        return pestType;
    }

    public void setPestType(String pestType) {
        this.pestType = pestType;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    
}
