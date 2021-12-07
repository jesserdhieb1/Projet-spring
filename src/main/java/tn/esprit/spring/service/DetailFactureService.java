package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;
import tn.esprit.spring.entity.DetailFacture;

public interface DetailFactureService {

	List<DetailFacture> getAllDetailFacture();
	DetailFacture addDetailFacture(DetailFacture Df);
	DetailFacture updateDetailFacture(DetailFacture f);

	Optional<DetailFacture> retrieveDetailFacture(Long id);

}
