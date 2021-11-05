package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entity.Panier;

public interface PanierService {
	List<Panier> getAllPanier();
	Panier addPanier(Panier p);
	Panier updatePanier(Panier p);

	Optional<Panier> retrievePanier(Long id);
}
