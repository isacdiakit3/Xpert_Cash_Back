package com.Xpertpro.XpertCash.Model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private long numeroPaiement;
    private long numeroDepense;
    private long montant;


}
