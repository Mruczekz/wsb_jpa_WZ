package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;

public interface PatientService {
    public PatientTO findById(final long id);

    long deleteById(long patientId);
}
