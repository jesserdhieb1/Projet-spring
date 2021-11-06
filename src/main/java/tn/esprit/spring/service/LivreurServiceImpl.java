package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Livreur;
import tn.esprit.spring.repository.LivreurRepository;
import tn.esprit.spring.repository.UserRepository;
@Service
public class LivreurServiceImpl implements LivreurService {
	private final LivreurRepository lr;
	
	@Autowired
	public LivreurServiceImpl(LivreurRepository lr) {
		this.lr=lr;
	}
	@Override
	public List<Livreur> retrieveAllLivreurs() {
		return (List<Livreur>)lr.findAll();
	}

	@Override
	public Livreur addLivreur(Livreur L) {
		lr.save(L);
		return L;
	}

	@Override
	public void deleteLivreur(Long id) {
		lr.deleteById(id);		
	}

	@Override
	public Livreur updateLivreur(Livreur L) {
		lr.save(L);
		return L;
	}

	@Override
	public Livreur retrieveLivreur(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
