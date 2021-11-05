package tn.esprit.spring.service;

import tn.esprit.spring.entity.DetailProduit;;

public interface DetailProduitService {
	void addDetailProduit(DetailProduit detailProduit);
    DetailProduit getDetailProduitById(long id);

}
