package com.Xpertpro.XpertCash.Repository;

import com.Xpertpro.XpertCash.Model.Abonnement;
import com.Xpertpro.XpertCash.Model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
