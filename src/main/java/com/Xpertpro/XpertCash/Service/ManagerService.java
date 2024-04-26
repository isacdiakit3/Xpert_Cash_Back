package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Model.Manager;
import com.Xpertpro.XpertCash.Model.Vendeur;
import com.Xpertpro.XpertCash.Repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private ManagerRepository managerRepository;

    public Manager inscrire(Manager manager){
        return managerRepository.save(manager);
    }

    public List<Manager> list(){
        return managerRepository.findAll();
    }

    public String supprimer(Long id){
        managerRepository.deleteById(id);
        return "Suppression effectuée";
    }

    public Manager connexion(Long code){
        Manager manager  = managerRepository.findManagerByCode(code);
        return manager;
    }
}
