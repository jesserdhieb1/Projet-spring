package tn.esprit.spring.service;
import java.util.List;
import java.util.Optional;


import tn.esprit.spring.entity.Facture;

public interface FactureService {
	List<Facture> getAllFacture();
	Facture addFacture(Facture f);
	Facture updateFacture(Facture f);

	Optional<Facture> retrieveFacture(Long id);
}
