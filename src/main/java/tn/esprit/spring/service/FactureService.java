package tn.esprit.spring.service;
import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;

import tn.esprit.spring.entity.Facture;

@Service

public interface FactureService {
	List<Facture> getAllFacture();
	Facture addFacture(Facture f,Long user_id);
	Facture updateFacture(Facture f);

	Optional<Facture> retrieveFacture(Long id);
}
