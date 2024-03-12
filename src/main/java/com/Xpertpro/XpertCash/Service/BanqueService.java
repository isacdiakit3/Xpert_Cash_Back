package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.BanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BanqueService {
    @Autowired
    private BanqueRepository banqueRepository;
}
