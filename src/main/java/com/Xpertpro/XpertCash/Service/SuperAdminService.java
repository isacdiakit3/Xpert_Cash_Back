package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.SuperAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperAdminService {

    @Autowired
    private SuperAdminRepository superAdminRepository;
}
