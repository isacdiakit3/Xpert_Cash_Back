package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaiementService {

    @Autowired
    private PaiementRepository paiementRepository;
}
