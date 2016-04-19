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
 * SocialHabits generated by hbm2java
 */
@Entity
@Table(name="social_habits"
    ,catalog="patient"
)
public class SocialHabits  implements java.io.Serializable {


     private String patientUpi;
     private Patient patient;
     private Character smokingHabit;
     private Integer smokingYears;
     private Character alcoholHabit;
     private Integer alcoholYears;
     private Character recreationalDrugs;

    public SocialHabits() {
    }

	
    public SocialHabits(Patient patient) {
        this.patient = patient;
    }
    public SocialHabits(Patient patient, Character smokingHabit, Integer smokingYears, Character alcoholHabit, Integer alcoholYears, Character recreationalDrugs) {
       this.patient = patient;
       this.smokingHabit = smokingHabit;
       this.smokingYears = smokingYears;
       this.alcoholHabit = alcoholHabit;
       this.alcoholYears = alcoholYears;
       this.recreationalDrugs = recreationalDrugs;
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

    
    @Column(name="smoking_habit", length=1)
    public Character getSmokingHabit() {
        return this.smokingHabit;
    }
    
    public void setSmokingHabit(Character smokingHabit) {
        this.smokingHabit = smokingHabit;
    }

    
    @Column(name="smoking_years")
    public Integer getSmokingYears() {
        return this.smokingYears;
    }
    
    public void setSmokingYears(Integer smokingYears) {
        this.smokingYears = smokingYears;
    }

    
    @Column(name="alcohol_habit", length=1)
    public Character getAlcoholHabit() {
        return this.alcoholHabit;
    }
    
    public void setAlcoholHabit(Character alcoholHabit) {
        this.alcoholHabit = alcoholHabit;
    }

    
    @Column(name="alcohol_years")
    public Integer getAlcoholYears() {
        return this.alcoholYears;
    }
    
    public void setAlcoholYears(Integer alcoholYears) {
        this.alcoholYears = alcoholYears;
    }

    
    @Column(name="recreational_drugs", length=1)
    public Character getRecreationalDrugs() {
        return this.recreationalDrugs;
    }
    
    public void setRecreationalDrugs(Character recreationalDrugs) {
        this.recreationalDrugs = recreationalDrugs;
    }




}


