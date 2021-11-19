package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Livreur;
import tn.esprit.spring.repository.LivreurRepository;

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
		Livreur lvr = lr.findById(id).get();
		return lvr;		 
	}

	@Override
	public List<Livreur> sortUp() {
		return (List<Livreur>)lr.SortUp();
	}
	
	@Override
	public List<Livreur> findByName(String key) {
		return (List<Livreur>)lr.findByName(key);
	}
	
	@Override
	public List<Livreur> sortDown() {
		return (List<Livreur>)lr.SortDown();
	}


	@Override
	public List<Livreur> findByCity(String key)
	{
		return (List<Livreur>)lr.findByCity(key);

	}
}
