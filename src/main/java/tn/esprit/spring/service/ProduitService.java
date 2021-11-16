package tn.esprit.spring.service;
import tn.esprit.spring.entity.Produit;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

public interface ProduitService {
	Produit addProduit(Produit produit);

	Produit getProduitById(long id);

	List<Produit> retrieveAllProduits();
	public Produit updateProduit(Produit p);
	public void deleteProduit(long idProduit);

}
