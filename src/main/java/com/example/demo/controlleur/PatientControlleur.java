package com.example.demo.controlleur;

import com.example.demo.models.Patient;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Patient")
public class PatientControlleur {
    @Autowired
    private   PatientService patientService;



    @GetMapping("/")
    public ResponseEntity<List<Patient>> getAllPatient(){
        List<Patient> patients=patientService.findAllPatients();
        return  new ResponseEntity<>(patients, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long id){
        Patient patient=patientService.findPatientById(id);
        return  new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient ){
        Patient newpatient=patientService.addPatient(patient);
        return  new ResponseEntity<>(newpatient, HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient,@PathVariable("id") Long id ){
        patient.setId(id);
        Patient updatepatient=patientService.updatePatient(patient);
        return  new ResponseEntity<>(updatepatient, HttpStatus.OK);

    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable("id") Long id){
        patientService.deletePatient(id);
        return  new ResponseEntity<>( HttpStatus.OK);

    }



}