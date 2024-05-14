package com.capgemini.wsb.persistence.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;


    @Test
    void name() {
    }
}