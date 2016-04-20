package com.parsd.patientengine.pojo;
// Generated Apr 19, 2016 7:35:31 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name="address"
    ,catalog="patient"
)
public class Address  implements java.io.Serializable {


     private String addressId;
     private Patient patient;
     private String street;
     private String city;
     private String state;
     private String zipcode;
     private String country;

    public Address() {
    }

	
    public Address(String addressId, String street, String city, String state, String zipcode, String country) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }
    public Address(String addressId, Patient patient, String street, String city, String state, String zipcode, String country) {
       this.addressId = addressId;
       this.patient = patient;
       this.street = street;
       this.city = city;
       this.state = state;
       this.zipcode = zipcode;
       this.country = country;
    }
   
     @Id 

    
    @Column(name="address_id", unique=true, nullable=false, length=6)
    public String getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="patient_UPI")
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    @Column(name="street", nullable=false, length=20)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="city", nullable=false, length=20)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="state", nullable=false, length=2)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="zipcode", nullable=false, length=5)
    public String getZipcode() {
        return this.zipcode;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    
    @Column(name="country", nullable=false, length=2)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }




}

