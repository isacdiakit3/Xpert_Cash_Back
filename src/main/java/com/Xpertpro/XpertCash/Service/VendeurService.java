package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.VendeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendeurService {

    @Autowired
    private VendeurRepository vendeurRepository;
}
