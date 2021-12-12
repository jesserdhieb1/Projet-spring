package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.entity.Facture;

@Repository
public interface FactureRepository extends CrudRepository<Facture,Long> {
	
	@Query(value="SELECT SUM(prix_total) FROM detailfacture WHERE detailfacture.f_id_facture =:idF",nativeQuery=true)
	 Long getPrixTotalF(Long idF);
}
