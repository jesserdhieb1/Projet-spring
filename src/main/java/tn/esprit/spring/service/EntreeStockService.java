package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entity.EntreeStock;

public interface EntreeStockService {
	List<EntreeStock> retrieveAllEntreeStocks();

	EntreeStock addEntreeStock(EntreeStock s);
	EntreeStock updateEntreeStock(EntreeStock u);

	Optional<EntreeStock> retrieveEntreeStock(Long id);

}
