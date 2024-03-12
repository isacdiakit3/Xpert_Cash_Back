package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.DepenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepenseService {

    @Autowired
    private DepenseRepository depenseRepository;
}
