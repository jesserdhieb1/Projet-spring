package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entity.SortieStock;

public interface SortieStockService {
	List<SortieStock> retrieveAllSortieStocks();

	SortieStock updateSortieStock(SortieStock u);

	Optional<SortieStock> retrieveSortieStock(Long id);
}
