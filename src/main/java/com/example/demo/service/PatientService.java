package com.example.demo.service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.models.Patient;
import com.example.demo.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class PatientService {
    @Autowired
    private  PatientRepo patientRepo;


    public Patient addPatient(Patient patient){
        return patientRepo.save(patient);

    }
    public  List<Patient> findAllPatients(){
        return  patientRepo.findAll();
    }
    public Patient updatePatient(Patient patient){
       Patient p= patientRepo.findPatientById(patient.getId());
       if (patient.getPrenom()!=null)
           p.setPrenom(patient.getPrenom());

        if (patient.getNom()!=null)
            p.setNom(patient.getNom());

        if (patient.getAdresse()!=null)
            p.setAdresse(patient.getAdresse());

        if ((Integer)patient.getAge()>0)
            p.setAge(patient.getAge());

        if (patient.getTelephone()!=null)
            p.setTelephone(patient.getTelephone());

        if (patient.getDatedeNaissace()!=null)
            p.setDatedeNaissace(patient.getDatedeNaissace());



        return patientRepo.save(p);
    }
    public  Patient findPatientById(Long id){
        return  patientRepo.findPatientById(id);
    }
    public  void deletePatient(Long id){
        patientRepo.deletePatientById(id);
    }


}