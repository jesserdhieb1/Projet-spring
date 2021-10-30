package tn.esprit.spring.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.SortieStock;

@Repository
public interface SortieStockRepository extends  CrudRepository<SortieStock, Long>{
	
}
