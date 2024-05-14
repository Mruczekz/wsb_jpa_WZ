package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.service.DoctorService;
import com.capgemini.wsb.service.PatientService;
import com.capgemini.wsb.service.VisitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientServiceImplTest {

    @Autowired
    PatientService patientService;
    @Autowired
    VisitService visitService;
    @Autowired
    DoctorService doctorService;
    @Test
    void deleteById() {
        //given
        //patientService, data.sql
        //when
        patientService.deleteById(1);
        //then
        assertNull(patientService.findById(1));
        assertNull(visitService.findById(1));
        assertNull(visitService.findById(2));
        assertNotNull(doctorService.findById(1));
    }
}