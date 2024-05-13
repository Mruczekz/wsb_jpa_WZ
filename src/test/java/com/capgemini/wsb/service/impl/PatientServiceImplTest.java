package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientServiceImplTest {

    @Autowired
    PatientService patientService;
    @Test
    void deleteById() {
        patientService.deleteById(1);
    }
}