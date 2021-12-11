package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Livraison;

@Repository
public interface LivraisonRepository extends CrudRepository<Livraison, Long>{

	
	@Query("SELECT lvr FROM Livraison lvr WHERE lvr.L.idLiv = ?1 ")
	List<Livraison> findByIdLivreur(Long key);
	
	@Query("SELECT lvr FROM Livraison lvr Order By lvr.dateLivraisonDate ASC ")
	List<Livraison> orderByDate();
	
	@Query("SELECT lvr FROM Livraison lvr WHERE lvr.dateLivraisonDate = ?1 ")
	List<Livraison> findByDate(Date d);
	
}
