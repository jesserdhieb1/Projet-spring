package tn.esprit.spring.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Repository.SortieStockRepository;
import tn.esprit.spring.entity.SortieStock;

@Service
public class SortieStockImpl implements SortieStockService{

	private final SortieStockRepository SSR;
	
	@Autowired
	public SortieStockImpl(SortieStockRepository SSR) {
		this.SSR=SSR;
	}
	@Override
	public List<SortieStock> retrieveAllSortieStocks() {
		// TODO Auto-generated method stub
		return (List<SortieStock>)SSR.findAll();
	}

	@Override
	public SortieStock updateSortieStock(SortieStock u) {
		// TODO Auto-generated method stub
		SSR.save(u);
		return u;
	}

	@Override
	public Optional<SortieStock> retrieveSortieStock(Long id) {
		// TODO Auto-generated method stub
		return SSR.findById(id);
	}

}
