package tn.esprit.spring.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Rayon;

@Repository
public interface RayonRepository  extends  CrudRepository<Rayon, Long> {

}
