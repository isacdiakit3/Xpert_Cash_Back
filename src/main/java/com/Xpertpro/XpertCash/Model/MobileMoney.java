package com.Xpertpro.XpertCash.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MobileMoney {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private long numeroPaiement;
    private long numeroDepense;
    private long montant;
}
