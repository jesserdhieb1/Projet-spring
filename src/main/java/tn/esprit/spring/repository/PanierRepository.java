package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Panier;

public interface PanierRepository extends CrudRepository<Panier, Long> {
	
}
