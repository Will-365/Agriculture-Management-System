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
public class Farm implements Serializable{
    private static final long serialVersionUID = 8146841017796908636L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long farmId;
    
    private String name;
    private String location;
    private Double sizes;
    
    @ManyToOne
    @JoinColumn(name = "farmerId")
    private User farmer;
    
    @OneToMany(mappedBy = "farm")
    private Set<Field> fields;

    public Farm() {
    }

    public Farm(Long farmId) {
        this.farmId = farmId;
    }

    public Farm(Long farmId, String name, String location, Double size, User farmer, Set<Field> fields) {
        this.farmId = farmId;
        this.name = name;
        this.location = location;
        this.sizes = size;
        this.farmer = farmer;
        this.fields = fields;
    }

    public Long getFarmId() {
        return farmId;
    }

    public void setFarmId(Long farmId) {
        this.farmId = farmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getSize() {
        return sizes;
    }

    public void setSize(Double size) {
        this.sizes = size;
    }

    public User getFarmer() {
        return farmer;
    }

    public void setFarmer(User farmer) {
        this.farmer = farmer;
    }

    public Set<Field> getFields() {
        return fields;
    }

    public void setFields(Set<Field> fields) {
        this.fields = fields;
    }

   
    
}
