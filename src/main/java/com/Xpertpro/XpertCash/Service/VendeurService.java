package com.Xpertpro.XpertCash.Service;

import com.Xpertpro.XpertCash.Model.Manager;
import com.Xpertpro.XpertCash.Model.Vendeur;
import com.Xpertpro.XpertCash.Repository.VendeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendeurService {

    @Autowired
    private VendeurRepository vendeurRepository;

    public Vendeur inscrire(Vendeur vendeur){
        return vendeurRepository.save(vendeur);
    }

    public List<Vendeur> list(){
        return vendeurRepository.findAll();
    }

    public String supprimer(Long id){
        vendeurRepository.deleteById(id);
        return "Suppression effectuée";
    }

    public Vendeur connexion(Long code){
        Vendeur vendeur  = vendeurRepository.findVendeurByCode(code);
        return vendeur;
    }
}
