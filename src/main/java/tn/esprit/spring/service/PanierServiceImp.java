package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Panier;
import tn.esprit.spring.repository.PanierRepository;

public class PanierServiceImp implements PanierService {

	@Autowired
	PanierRepository pr;
	
	@Override
	public List<Panier> getAllPanier() {
		List<Panier> Paniers=new ArrayList<Panier>();
		this.pr.findAll().forEach(p1->Paniers.add(p1));
		return Paniers;
	}	

	@Override
	public Panier addPanier(Panier p) {
		this.pr.save(p);
		return p;
	}

	@Override
	public Panier updatePanier(Panier p) {
		this.pr.save(p);
		return p;
	}

	@Override
	public Optional<Panier> retrievePanier(Long id) {
		return Optional.ofNullable(this.pr.findById(id).get());

	}

	
	

}