package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.PaiementRepository;
import com.Xpertpro.XpertCash.Repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanService {

    @Autowired
    private PlanRepository planRepository;
}
