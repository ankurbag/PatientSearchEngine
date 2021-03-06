package com.parsd.patientengine.pojo;
// Generated Apr 20, 2016 9:22:47 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * BedAssignment generated by hbm2java
 */
public class BedAssignment  implements java.io.Serializable {


     private int bedAssignmentId;
     private PatientEvent patientEvent;
     private Date dateFrom;
     private Date dateTill;
     private String wardType;

    public BedAssignment() {
    	patientEvent = new PatientEvent();
    }

    public BedAssignment(int bedAssignmentId, PatientEvent patientEvent, Date dateFrom, Date dateTill, String wardType) {
       this.bedAssignmentId = bedAssignmentId;
       this.patientEvent = patientEvent;
       this.dateFrom = dateFrom;
       this.dateTill = dateTill;
       this.wardType = wardType;
    }
   
    public int getBedAssignmentId() {
        return this.bedAssignmentId;
    }
    
    public void setBedAssignmentId(int bedAssignmentId) {
        this.bedAssignmentId = bedAssignmentId;
    }
    public PatientEvent getPatientEvent() {
        return this.patientEvent;
    }
    
    public void setPatientEvent(PatientEvent patientEvent) {
        this.patientEvent = patientEvent;
    }
    public Date getDateFrom() {
        return this.dateFrom;
    }
    
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }
    public Date getDateTill() {
        return this.dateTill;
    }
    
    public void setDateTill(Date dateTill) {
        this.dateTill = dateTill;
    }
    public String getWardType() {
        return this.wardType;
    }
    
    public void setWardType(String wardType) {
        this.wardType = wardType;
    }




}


