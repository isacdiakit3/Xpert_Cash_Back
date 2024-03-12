package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.CaisseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaisseService {

    @Autowired
    private CaisseRepository caisseRepository;
}
