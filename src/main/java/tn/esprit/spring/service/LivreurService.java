package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Livreur;

public interface LivreurService {

    List<Livreur> retrieveAllLivreurs();
	
	Livreur addLivreur(Livreur L);
	
	void deleteLivreur(Long id);
	
	Livreur updateLivreur(Livreur L);
	
	Livreur retrieveLivreur(Long id);
}
