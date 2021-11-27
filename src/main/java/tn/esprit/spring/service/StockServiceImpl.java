package tn.esprit.spring.service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.repository.StockRepository;
import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.entity.Stock;



@Service
public class StockServiceImpl implements StockService{

	private final StockRepository ESR;
	@Autowired
	public StockServiceImpl(StockRepository ESR) {
		this.ESR=ESR;
	}
	@Override
	public List<Stock> retrieveAllStocks() {
		// TODO Auto-generated method stub
		return (List<Stock>)ESR.findAll();
	}

	@Override
	public Stock addStock(Stock s) {
		// TODO Auto-generated method stub
		ESR.save(s);
		return s;
	}

	@Override
	public Stock updateStock(Stock u) {
		// TODO Auto-generated method stub
		ESR.save(u);
		return u;
	}

	@Override
	public Optional<Stock> retrieveStock(Long id) {
		// TODO Auto-generated method stub
		return ESR.findById(id);
	}
	@Override
	public List<Stock> findByDate(Date date) {
		// TODO Auto-generated method stub
		return (List<Stock>)ESR.findByDate(date);
	}

}
