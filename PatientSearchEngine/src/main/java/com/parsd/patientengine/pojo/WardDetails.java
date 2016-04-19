package com.parsd.patientengine.pojo;
// Generated Apr 19, 2016 7:35:31 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * WardDetails generated by hbm2java
 */
@Entity
@Table(name="ward_details"
    ,catalog="patient"
)
public class WardDetails  implements java.io.Serializable {


     private String wardId;
     private String wardType;

    public WardDetails() {
    }

    public WardDetails(String wardId, String wardType) {
       this.wardId = wardId;
       this.wardType = wardType;
    }
   
     @Id 

    
    @Column(name="ward_id", unique=true, nullable=false, length=3)
    public String getWardId() {
        return this.wardId;
    }
    
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    
    @Column(name="ward_type", nullable=false, length=50)
    public String getWardType() {
        return this.wardType;
    }
    
    public void setWardType(String wardType) {
        this.wardType = wardType;
    }




}


