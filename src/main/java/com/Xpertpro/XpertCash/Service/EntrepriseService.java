package com.Xpertpro.XpertCash.Service;
import com.Xpertpro.XpertCash.Model.Entreprise;
import com.Xpertpro.XpertCash.Repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    public Entreprise inscrire(Entreprise entreprise){
        return entrepriseRepository.save(entreprise);
    }

    public List<Entreprise> list(){
        return entrepriseRepository.findAll();
    }

    public String supprimer(Long id){
        entrepriseRepository.deleteById(id);
        return "Suppression effectuer";
    }
}
