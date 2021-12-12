package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.FactureRepository;
import tn.esprit.spring.repository.UserRepository;  
@Service
public class FactureServiceImp implements FactureService{

	@Autowired  
	FactureRepository fR;
	@Autowired
	UserRepository uR;
	
	@Override
	public List<Facture> getAllFacture() {
		List<Facture> Factures = new ArrayList<Facture>();  
		this.fR.findAll().forEach(fr1 -> Factures.add(fr1));  
		return Factures;
	}

	@Override
	public Facture addFacture(Facture f,Long user_id) {
		User u= uR.findById(user_id).get();
		f.setDateFacture(new Date());
		f.setUser(u);
		return this.fR.save(f);
	}

	@Override
	public Facture updateFacture(Facture f) {
		return this.fR.save(f);	
	}

	@Override
	public Optional<Facture> retrieveFacture(Long id) {
		return Optional.ofNullable(this.fR.findById(id).get());
	}
	@Override
	public Long getPrixTotalFacture(Long idFacture) {
		return this.fR.getPrixTotalF(idFacture);
	}
}
