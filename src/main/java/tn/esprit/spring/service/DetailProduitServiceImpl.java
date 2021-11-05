package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.repository.DetailProduitRepository;
import tn.esprit.spring.entity.DetailProduit;

@Service
public class DetailProduitServiceImpl implements DetailProduitService {
	
	
	
	 @Autowired
	    DetailProduitRepository detailProduitRepository;
	    @Override
	    public void addDetailProduit(DetailProduit detailProduit) {
	        if(!detailProduitRepository.findById(detailProduit.getIdDetailProduit()).isPresent()){
	            detailProduitRepository.save(detailProduit);
	        }else{
	            System.out.println("Detail Produit existe dÃ©ja !!");
	        }
	    }

	    @Override
	    public DetailProduit getDetailProduitById(long id) {
	        return detailProduitRepository.findById(id).get();
	    }

}
