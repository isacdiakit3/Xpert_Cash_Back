package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Model.Commande;
import com.Xpertpro.XpertCash.Repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;


    public Commande ajouter(Commande commande){
        return commandeRepository.save(commande);
    }
}
