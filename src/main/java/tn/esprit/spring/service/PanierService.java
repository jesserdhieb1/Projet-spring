package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;


import tn.esprit.spring.entity.Panier;

public interface PanierService {
	List<Panier> getAllPanier();
	Panier addPanier(Panier p);
	Panier updatePanier(Panier p);
	void deletePanier(Long id);
	Optional<Panier> retrievePanier(Long id);
	Panier getPanierByUser(Long user_id );
}
