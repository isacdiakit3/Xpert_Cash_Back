package com.Xpertpro.XpertCash.Repository;

import com.Xpertpro.XpertCash.Model.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement , Long> {
}
