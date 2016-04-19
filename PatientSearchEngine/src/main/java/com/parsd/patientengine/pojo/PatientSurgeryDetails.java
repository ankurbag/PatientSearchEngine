package com.parsd.patientengine.pojo;
// Generated Apr 19, 2016 7:35:31 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PatientSurgeryDetails generated by hbm2java
 */
@Entity
@Table(name="patient_surgery_details"
    ,catalog="patient"
)
public class PatientSurgeryDetails  implements java.io.Serializable {


     private PatientSurgeryDetailsId id;
     private ProcedureLk procedureLk;
     private String surgeryNotes;
     private Date surgeryStartTime;
     private Date surgerEndTime;

    public PatientSurgeryDetails() {
    }

	
    public PatientSurgeryDetails(PatientSurgeryDetailsId id, Date surgeryStartTime, Date surgerEndTime) {
        this.id = id;
        this.surgeryStartTime = surgeryStartTime;
        this.surgerEndTime = surgerEndTime;
    }
    public PatientSurgeryDetails(PatientSurgeryDetailsId id, ProcedureLk procedureLk, String surgeryNotes, Date surgeryStartTime, Date surgerEndTime) {
       this.id = id;
       this.procedureLk = procedureLk;
       this.surgeryNotes = surgeryNotes;
       this.surgeryStartTime = surgeryStartTime;
       this.surgerEndTime = surgerEndTime;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="patientUpi", column=@Column(name="patient_UPI", nullable=false, length=6) ), 
        @AttributeOverride(name="doctorId", column=@Column(name="doctor_id", nullable=false) ), 
        @AttributeOverride(name="eventDate", column=@Column(name="event_date", nullable=false, length=10) ) } )
    public PatientSurgeryDetailsId getId() {
        return this.id;
    }
    
    public void setId(PatientSurgeryDetailsId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="procedure_id")
    public ProcedureLk getProcedureLk() {
        return this.procedureLk;
    }
    
    public void setProcedureLk(ProcedureLk procedureLk) {
        this.procedureLk = procedureLk;
    }

    
    @Column(name="surgery_notes")
    public String getSurgeryNotes() {
        return this.surgeryNotes;
    }
    
    public void setSurgeryNotes(String surgeryNotes) {
        this.surgeryNotes = surgeryNotes;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="surgery_start_time", nullable=false, length=19)
    public Date getSurgeryStartTime() {
        return this.surgeryStartTime;
    }
    
    public void setSurgeryStartTime(Date surgeryStartTime) {
        this.surgeryStartTime = surgeryStartTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="surger_end_time", nullable=false, length=19)
    public Date getSurgerEndTime() {
        return this.surgerEndTime;
    }
    
    public void setSurgerEndTime(Date surgerEndTime) {
        this.surgerEndTime = surgerEndTime;
    }




}


