package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Panier;
@Repository
public interface PanierRepository extends CrudRepository<Panier, Long> {
	@Modifying
	@Query("update Panier p set p.prixTotal = :panierPar.prixTotal ")
	Panier updatePanierPrixTotal(@Param("panierPar")Panier panierPar); 
}
