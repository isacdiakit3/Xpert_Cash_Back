package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.CategorieDepenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieDepenseService {

    @Autowired
    private CategorieDepenseRepository categorieDepenseRepository;
}
