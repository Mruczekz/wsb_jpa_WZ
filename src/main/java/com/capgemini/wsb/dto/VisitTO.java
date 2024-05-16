package com.capgemini.wsb.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class VisitTO implements Serializable {
    private Long id;
    private String description;
    private LocalDateTime time;
    private PatientSmallTO patient;
    private DoctorSmallTO doctor;
    private List<MedicalTreatmentTO> medicalTreatments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public PatientSmallTO getPatient() {
        return patient;
    }

    public void setPatient(PatientSmallTO patient) {
        this.patient = patient;
    }

    public DoctorSmallTO getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorSmallTO doctor) {
        this.doctor = doctor;
    }

    public List<MedicalTreatmentTO> getMedicalTreatments() {
        return medicalTreatments;
    }

    public void setMedicalTreatments(List<MedicalTreatmentTO> medicalTreatments) {
        this.medicalTreatments = medicalTreatments;
    }
}