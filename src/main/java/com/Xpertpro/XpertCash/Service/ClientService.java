package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
}
