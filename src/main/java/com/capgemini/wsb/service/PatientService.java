package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;

import java.util.List;

public interface PatientService {
    PatientTO findById(final long id);

    long deleteById(long patientId);

    PatientTO addPatient(PatientTO patientTO);

    List<VisitTO> getPatientVisits(long patientId);

    List<PatientTO> getPatientsByLastName (String lastName);

}
