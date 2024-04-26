package com.Xpertpro.XpertCash.Repository;
import com.Xpertpro.XpertCash.Model.Vendeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendeurRepository extends JpaRepository<Vendeur, Long> {

    Vendeur findVendeurByCode(Long code);

}
