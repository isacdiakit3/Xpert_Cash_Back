package com.Xpertpro.XpertCash.Repository;

import com.Xpertpro.XpertCash.Model.Abonnement;
import com.Xpertpro.XpertCash.Model.Caisse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaisseRepository extends JpaRepository<Caisse, Long> {
}
