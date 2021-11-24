package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;

import tn.esprit.spring.entity.Livraison;

public interface LivraisonService {

	   public List<Livraison> retrieveAllLivraisons();
		
		Livraison addLivraison(Livraison L);
		
		void deleteLivraison(Long id);
		
		Livraison updateLivraison(Livraison L);
		
		Livraison retrieveLivraison(Long id);
		
		public List<Livraison> FindByIdLivreur(Long id);
		
		public List<Livraison> findByDate(Date d);
		
		public List<Livraison> orderByDate();

}
