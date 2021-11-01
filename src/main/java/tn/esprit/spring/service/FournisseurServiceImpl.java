package tn.esprit.spring.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.Repository.FournisseurRepository;

@Service
public class FournisseurServiceImpl implements FournisseurService{

	private final FournisseurRepository Fr;
	@Autowired
	public FournisseurServiceImpl(FournisseurRepository Fr) {
		this.Fr=Fr;
	}
	
	@Override
	public List<Fournisseur> retrieveAllFournisseurs() {
		// TODO Auto-generated method stub
		return (List<Fournisseur>)Fr.findAll();
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
	Fr.save(f);
	return f;
	}

	@Override
	public void deleteFournisseur(Long id) {
		// TODO Auto-generated method stub
		Fr.deleteById(id);
		
	}

	@Override
	public Fournisseur updateFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
		Fr.save(f);
		return f;
	}
	
	

}
