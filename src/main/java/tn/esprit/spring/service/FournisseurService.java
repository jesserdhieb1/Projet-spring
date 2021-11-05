package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Fournisseur;

public interface FournisseurService {
	List<Fournisseur> retrieveAllFournisseurs();

	Fournisseur addFournisseur(Fournisseur f);

	void deleteFournisseur(Long id);

	Fournisseur updateFournisseur(Fournisseur f);
	Optional<Fournisseur> retrieveFournisseur(Long id);

}
