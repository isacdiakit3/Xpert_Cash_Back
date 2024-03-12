package com.Xpertpro.XpertCash.Repository;

import com.Xpertpro.XpertCash.Model.Plan;
import com.Xpertpro.XpertCash.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
