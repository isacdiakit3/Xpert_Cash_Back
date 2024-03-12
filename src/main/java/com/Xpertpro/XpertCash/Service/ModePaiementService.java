package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.ModePaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModePaiementService {

    @Autowired
    private ModePaiementRepository modePaiementRepository;
}
