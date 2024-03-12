package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;
}
