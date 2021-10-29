package tn.esprit.spring.service;
import tn.esprit.spring.entity.Produit;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

public interface ProduitService {
	
	List<Produit> retrieveAllProduits();

	Produit addProduit(Produit p, Long idRayon, Long idStock);

	 Optional<Produit>  retrieveProduit(Long id);

}
