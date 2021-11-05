package tn.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.*;
@Repository
public interface FournisseurRepository  extends  CrudRepository<Fournisseur, Long> {


}