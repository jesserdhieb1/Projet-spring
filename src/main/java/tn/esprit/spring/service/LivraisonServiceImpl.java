package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Livraison;
import tn.esprit.spring.repository.LivraisonRepository;

public class LivraisonServiceImpl implements LivraisonService {
	private final LivraisonRepository lvr;
	@Autowired
	public LivraisonServiceImpl(LivraisonRepository lvr) {
		this.lvr=lvr;
	}
	@Override
	public List<Livraison> retrieveAllLivraisons() {
		return (List<Livraison>)lvr.findAll();
	}

	@Override
	public Livraison addLivraison(Livraison L) {
		lvr.save(L);
		return L;
	}

	@Override
	public void deleteLivraison(Long id) {
		lvr.deleteById(id);		
	}

	@Override
	public Livraison updateLivraison(Livraison L) {
		lvr.save(L);
		return L;
	}

	@Override
	public Livraison retrieveLivraison(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
