package com.Xpertpro.XpertCash.Service;


import com.Xpertpro.XpertCash.Repository.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenteService {

    @Autowired
    private VenteRepository venteRepository;
}
