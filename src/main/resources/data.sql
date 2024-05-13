-- Dodawanie adresów
INSERT INTO ADDRESS (id, address_line1, address_line2, city, postal_code)
VALUES
    (1, 'ul. Kwiatowa 1', NULL, 'Warszawa', '00-001'),
    (2, 'ul. Słoneczna 5', NULL, 'Kraków', '30-005'),
    (3, 'ul. Leśna 10', NULL, 'Gdańsk', '80-010');

-- Dodawanie lekarzy
INSERT INTO DOCTOR (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
VALUES
    (1, 'Jan', 'Kowalski', '123456789', 'jan.kowalski@example.com', 'DOC123', 'SURGEON'),
    (2, 'Anna', 'Nowak', '987654321', 'anna.nowak@example.com', 'DOC456', 'DERMATOLOGIST'),
    (3, 'Piotr', 'Wiśniewski', '555444333', 'piotr.wisniewski@example.com', 'DOC789', 'OCULIST');

-- Dodawanie pacjentów
INSERT INTO PATIENT (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, sex)
VALUES
    (1, 'Alicja', 'Zielonka', '111222333', 'alicja.zielonka@example.com', 'PAT001', '1990-05-15', 'F'),
    (2, 'Bartosz', 'Kowalczyk', '444555666', 'bartosz.kowalczyk@example.com', 'PAT002', '1985-10-20', 'M'),
    (3, 'Katarzyna', 'Jankowska', '777888999', 'katarzyna.jankowska@example.com', 'PAT003', '1978-03-25', 'F');

-- Dodawanie wizyt
-- Wizyty dla pacjenta 1
INSERT INTO VISIT (id, description, time, PATIENT_ID, DOCTOR_ID)
VALUES
    (1, 'Badanie kontrolne', '2024-05-10 09:00:00', 1, 1),
    (2, 'Konsultacja przed operacją', '2024-05-12 14:30:00', 1, 1);

-- Wizyty dla pacjenta 2
INSERT INTO VISIT (id, description, time, PATIENT_ID, DOCTOR_ID)
VALUES
    (3, 'Szczepienie', '2024-05-11 11:15:00', 2, 2),
    (4, 'Badanie ogólne', '2024-05-14 10:00:00', 2, 3);

-- Wizyty dla pacjenta 1 (kontynuacja)
INSERT INTO VISIT (id, description, time, PATIENT_ID, DOCTOR_ID)
VALUES
    (5, 'Kontynuacja leczenia', '2024-05-16 08:45:00', 1, 1),
    (6, 'Ocena stanu po operacji', '2024-05-20 11:30:00', 1, 1);

-- Wizyty dla pacjenta 2 (kontynuacja)
INSERT INTO VISIT (id, description, time, PATIENT_ID, DOCTOR_ID)
VALUES
    (7, 'Wyniki badań', '2024-05-18 09:45:00', 2, 3),
    (8, 'Konsultacja dietetyczna', '2024-05-22 15:00:00', 2, 3);

-- Dodawanie leczenia medycznego
INSERT INTO MEDICAL_TREATMENT (id, description, type, VISIT_ID)
VALUES
    (1, 'Przepisanie leków', 'RTG', 1),
    (2, 'Przegląd historii choroby', 'EKG', 2),
    (3, 'Szczepienie przeciw grypie', 'USG', 3),
    (4, 'Badanie krwi', 'RTG', 4),
    (5, 'Kontrola ciśnienia krwi', 'EKG', 5),
    (6, 'Zdejmowanie szwów', 'USG', 6),
    (7, 'Zalecenia dietetyczne', 'RTG', 7),
    (8, 'Konsultacja psychologiczna', 'EKG', 8);