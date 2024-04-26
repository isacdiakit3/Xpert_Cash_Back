package com.Xpertpro.XpertCash.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String prenom;
    private String nom;
    private long telephone;
    private String email;
    private String password;
    private long code;

   }
