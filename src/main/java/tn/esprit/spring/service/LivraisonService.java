package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Livraison;

public interface LivraisonService {

	   public List<Livraison> retrieveAllLivraisons();
		
		Livraison addLivraison(Livraison L);
		
		void deleteLivraison(Long id);
		
		Livraison updateLivraison(Livraison L);
		
		Livraison retrieveLivraison(Long id);

}
