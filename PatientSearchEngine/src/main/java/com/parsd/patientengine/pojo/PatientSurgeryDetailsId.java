package com.parsd.patientengine.pojo;
// Generated Apr 19, 2016 7:35:31 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PatientSurgeryDetailsId generated by hbm2java
 */
@Embeddable
public class PatientSurgeryDetailsId  implements java.io.Serializable {


     private String patientUpi;
     private int doctorId;
     private Date eventDate;

    public PatientSurgeryDetailsId() {
    }

    public PatientSurgeryDetailsId(String patientUpi, int doctorId, Date eventDate) {
       this.patientUpi = patientUpi;
       this.doctorId = doctorId;
       this.eventDate = eventDate;
    }
   


    @Column(name="patient_UPI", nullable=false, length=6)
    public String getPatientUpi() {
        return this.patientUpi;
    }
    
    public void setPatientUpi(String patientUpi) {
        this.patientUpi = patientUpi;
    }


    @Column(name="doctor_id", nullable=false)
    public int getDoctorId() {
        return this.doctorId;
    }
    
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }


    @Column(name="event_date", nullable=false, length=10)
    public Date getEventDate() {
        return this.eventDate;
    }
    
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PatientSurgeryDetailsId) ) return false;
		 PatientSurgeryDetailsId castOther = ( PatientSurgeryDetailsId ) other; 
         
		 return ( (this.getPatientUpi()==castOther.getPatientUpi()) || ( this.getPatientUpi()!=null && castOther.getPatientUpi()!=null && this.getPatientUpi().equals(castOther.getPatientUpi()) ) )
 && (this.getDoctorId()==castOther.getDoctorId())
 && ( (this.getEventDate()==castOther.getEventDate()) || ( this.getEventDate()!=null && castOther.getEventDate()!=null && this.getEventDate().equals(castOther.getEventDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPatientUpi() == null ? 0 : this.getPatientUpi().hashCode() );
         result = 37 * result + this.getDoctorId();
         result = 37 * result + ( getEventDate() == null ? 0 : this.getEventDate().hashCode() );
         return result;
   }   


}


