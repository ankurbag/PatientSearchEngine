package com.parsd.patientengine.pojo;
// Generated Apr 19, 2016 7:35:31 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * FamilyHistory generated by hbm2java
 */
@Entity
@Table(name="family_history"
    ,catalog="patient"
)
public class FamilyHistory  implements java.io.Serializable {


     private String patientUpi;
     private Patient patient;
     private String memberName;
     private String memberPatientRelationship;
     private int age;
     private char alive;
     private String medicalConditions;
     private String deathCause;
     private Integer deathAge;

    public FamilyHistory() {
    }

	
    public FamilyHistory(Patient patient, String memberName, String memberPatientRelationship, int age, char alive, String medicalConditions) {
        this.patient = patient;
        this.memberName = memberName;
        this.memberPatientRelationship = memberPatientRelationship;
        this.age = age;
        this.alive = alive;
        this.medicalConditions = medicalConditions;
    }
    public FamilyHistory(Patient patient, String memberName, String memberPatientRelationship, int age, char alive, String medicalConditions, String deathCause, Integer deathAge) {
       this.patient = patient;
       this.memberName = memberName;
       this.memberPatientRelationship = memberPatientRelationship;
       this.age = age;
       this.alive = alive;
       this.medicalConditions = medicalConditions;
       this.deathCause = deathCause;
       this.deathAge = deathAge;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="patient"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="patient_UPI", unique=true, nullable=false, length=6)
    public String getPatientUpi() {
        return this.patientUpi;
    }
    
    public void setPatientUpi(String patientUpi) {
        this.patientUpi = patientUpi;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    @Column(name="member_name", nullable=false, length=40)
    public String getMemberName() {
        return this.memberName;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    
    @Column(name="member_patient_relationship", nullable=false, length=10)
    public String getMemberPatientRelationship() {
        return this.memberPatientRelationship;
    }
    
    public void setMemberPatientRelationship(String memberPatientRelationship) {
        this.memberPatientRelationship = memberPatientRelationship;
    }

    
    @Column(name="age", nullable=false)
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    
    @Column(name="alive", nullable=false, length=1)
    public char getAlive() {
        return this.alive;
    }
    
    public void setAlive(char alive) {
        this.alive = alive;
    }

    
    @Column(name="medical_conditions", nullable=false, length=50)
    public String getMedicalConditions() {
        return this.medicalConditions;
    }
    
    public void setMedicalConditions(String medicalConditions) {
        this.medicalConditions = medicalConditions;
    }

    
    @Column(name="death_cause", length=50)
    public String getDeathCause() {
        return this.deathCause;
    }
    
    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause;
    }

    
    @Column(name="death_age")
    public Integer getDeathAge() {
        return this.deathAge;
    }
    
    public void setDeathAge(Integer deathAge) {
        this.deathAge = deathAge;
    }




}


