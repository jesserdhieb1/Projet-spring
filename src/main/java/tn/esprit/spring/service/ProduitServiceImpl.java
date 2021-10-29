package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Produit;

import tn.esprit.spring.repository.ProduitRepository;

public class ProduitServiceImpl implements ProduitService{
	
	
	private final ProduitRepository PR ;
	 @Autowired
	    public ProduitServiceImpl(ProduitRepository PR){this.PR=PR;}


	@Override
	public List<Produit> retrieveAllProduits() {
		// TODO Auto-generated method stub
		return (List<Produit>)PR.findAll();
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		// TODO Auto-generated method stub
		
		PR.save(p);
		
        return p;
		
	}


	
	
	@Override
	public Optional<Produit> retrieveProduit(Long id) {
		// TODO Auto-generated method stub
		return PR.findById(id);
	}

}
