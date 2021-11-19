package tn.esprit.spring.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tn.esprit.spring.entity.Livreur;

public interface LivreurService{

    List<Livreur> retrieveAllLivreurs();
	
	Livreur addLivreur(Livreur L);
	
	void deleteLivreur(Long id);
	
	Livreur updateLivreur(Livreur L);
	
	Livreur retrieveLivreur(Long id);
		
	List<Livreur> findByName(String name);
	
	List<Livreur> sortUp();
	
	List<Livreur> sortDown();
	
	List<Livreur> findByCity(String key);
}
