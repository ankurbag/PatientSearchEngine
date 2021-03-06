package com.parsd.patientengine.pojo;
// Generated Apr 20, 2016 9:22:47 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PatientSurgeryDetails generated by hbm2java
 */
public class PatientSurgeryDetails  implements java.io.Serializable {


     private PatientSurgeryDetailsId id;
     private String surgeryNotes;
     private Date surgeryStartTime;
     private Date surgerEndTime;
     private Integer procedureId;

    public PatientSurgeryDetails() {
    }

	
    public PatientSurgeryDetails(PatientSurgeryDetailsId id, Date surgeryStartTime, Date surgerEndTime) {
        this.id = id;
        this.surgeryStartTime = surgeryStartTime;
        this.surgerEndTime = surgerEndTime;
    }
    public PatientSurgeryDetails(PatientSurgeryDetailsId id, String surgeryNotes, Date surgeryStartTime, Date surgerEndTime, Integer procedureId) {
       this.id = id;
       this.surgeryNotes = surgeryNotes;
       this.surgeryStartTime = surgeryStartTime;
       this.surgerEndTime = surgerEndTime;
       this.procedureId = procedureId;
    }
   
    public PatientSurgeryDetailsId getId() {
        return this.id;
    }
    
    public void setId(PatientSurgeryDetailsId id) {
        this.id = id;
    }
    public String getSurgeryNotes() {
        return this.surgeryNotes;
    }
    
    public void setSurgeryNotes(String surgeryNotes) {
        this.surgeryNotes = surgeryNotes;
    }
    public Date getSurgeryStartTime() {
        return this.surgeryStartTime;
    }
    
    public void setSurgeryStartTime(Date surgeryStartTime) {
        this.surgeryStartTime = surgeryStartTime;
    }
    public Date getSurgerEndTime() {
        return this.surgerEndTime;
    }
    
    public void setSurgerEndTime(Date surgerEndTime) {
        this.surgerEndTime = surgerEndTime;
    }
    public Integer getProcedureId() {
        return this.procedureId;
    }
    
    public void setProcedureId(Integer procedureId) {
        this.procedureId = procedureId;
    }




}


