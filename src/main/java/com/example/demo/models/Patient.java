package com.example.demo.models;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String nom;
    private String prenom;
    private int age;
    private Date datedeNaissace;
    private String adresse;
    private String telephone;

    public Patient(){}


    public Patient(Long id, String nom,String prenom,int age,Date datedeNaissace,String adresse,String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.datedeNaissace = datedeNaissace;
        this.adresse = adresse;
        this.telephone = telephone;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDatedeNaissace() {
        return datedeNaissace;
    }

    public void setDatedeNaissace(Date datedeNaissace) {
        this.datedeNaissace = datedeNaissace;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", datedeNaissace=" + datedeNaissace +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}