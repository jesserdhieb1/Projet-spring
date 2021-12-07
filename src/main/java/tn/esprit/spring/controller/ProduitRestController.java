package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

import java.util.List;

//import javax.validation.Valid;

import tn.esprit.spring.entity.Produit;


import tn.esprit.spring.service.ProduitServiceImpl;

@RestController
@CrossOrigin(origins = "*" )
@RequestMapping("/product")
public class ProduitRestController {

	@Autowired
	ProduitServiceImpl p;
	public  ProduitRestController(ProduitServiceImpl p){
		this.p=p;
	}


	// http://localhost:8089/SpringMVC/produit/retrieve-all-produits
	

		@GetMapping("/retrieve-all-produits")
		@ResponseBody
		@ApiOperation(value = "Récupérer la liste des produits")
		
		public List<Produit> getProduits() {
			List<Produit> listProduits = p.retrieveAllProduits();
			return listProduits;

		}


	@PostMapping("/addProduit")
	@ApiOperation(value = "Ajouter un nouveau produit")
	public List<Produit> addProduit(@RequestBody Produit pp){
		return p.addProduit(pp);
	}

	@PutMapping("/update")
	@ApiOperation(value = "Modifier un produit")

	public Produit updateProduitC(@RequestBody Produit pp) {
		Produit p1 = p.updateProduit(pp);
		return p1;
	}



	// http://localhost:8089/SpringMVC/client/remove-client/{client-id}
	@DeleteMapping("/remove-produit/{produit-id}")
	@ResponseBody
	@ApiOperation(value = "Supprimer un produit")
	public void removeProduit(@PathVariable("produit-id") Long produitId) {
		p.deleteProduit(produitId);
	}


}