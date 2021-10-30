package tn.esprit.spring.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.EntreeStock;


@Repository
public interface EntreeStockRepository extends  CrudRepository<EntreeStock, Long> {

}