package tn.esprit.spring.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.Repository.EntreeStockRepository;
import tn.esprit.spring.entity.EntreeStock;



@Service
public class EntreeStockServiceImpl implements EntreeStockService{

	private final EntreeStockRepository ESR;
	@Autowired
	public EntreeStockServiceImpl(EntreeStockRepository ESR) {
		this.ESR=ESR;}
	@Override
	public List<EntreeStock> retrieveAllEntreeStocks() {
		// TODO Auto-generated method stub
		return (List<EntreeStock>)ESR.findAll();
	}

	@Override
	public EntreeStock addEntreeStock(EntreeStock s) {
		// TODO Auto-generated method stub
		ESR.save(s);
		return s;
	}

	@Override
	public EntreeStock updateEntreeStock(EntreeStock u) {
		// TODO Auto-generated method stub
		return u;
	}

	@Override
	public Optional<EntreeStock> retrieveEntreeStock(Long id) {
		// TODO Auto-generated method stub
		return ESR.findById(id);
	}

}
