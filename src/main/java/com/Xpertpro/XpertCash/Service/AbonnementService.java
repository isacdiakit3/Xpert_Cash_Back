package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbonnementService {

    @Autowired
    private AbonnementRepository abonnementRepository;
}
