package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;
}
