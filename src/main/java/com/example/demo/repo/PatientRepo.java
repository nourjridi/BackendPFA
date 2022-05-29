package com.example.demo.repo;

import com.example.demo.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PatientRepo extends JpaRepository<Patient,Long> {

    void deletePatientById(Long id);

    Patient findPatientById(Long id);
}