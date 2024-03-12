package com.Xpertpro.XpertCash.Repository;


import com.Xpertpro.XpertCash.Model.Abonnement;
import com.Xpertpro.XpertCash.Model.CategorieDepense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDepenseRepository extends JpaRepository<CategorieDepense, Long> {
}
