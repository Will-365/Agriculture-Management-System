/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author user
 */
@Entity
public class Field implements Serializable{  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fieldId;
    
    private String name;
    private Double area;
    
    @ManyToOne
    @JoinColumn(name = "farmId")
    private Farm farm;
    
    
    
    @OneToMany(mappedBy = "field")
    private Set<PestManagement> pestManagements;

    public Field() {
    }

    public Field(Long fieldId) {
        this.fieldId = fieldId;
    }

    public Field(Long fieldId, String name, Double area, Farm farm, Set<Crop> crops, Set<PestManagement> pestManagements) {
        this.fieldId = fieldId;
        this.name = name;
        this.area = area;
        this.farm = farm;
        
        this.pestManagements = pestManagements;
    }

    public Long getFieldId() {
        return fieldId;
    }

    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

   

    public Set<PestManagement> getPestManagements() {
        return pestManagements;
    }

    public void setPestManagements(Set<PestManagement> pestManagements) {
        this.pestManagements = pestManagements;
    }

    
    
}
