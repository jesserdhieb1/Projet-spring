package tn.esprit.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Panier;
import tn.esprit.spring.service.PanierServiceImp;

@RestController
@RequestMapping("/panier")

public class PanierRestController {
	@Autowired  
	PanierServiceImp panierServImp;
	
	
	// http://localhost:8089/SpringMVC/panier/retrieve-all-paniers
	@GetMapping("/retrieve-all-paniers")
	@ResponseBody
	List<Panier> getAllPaniers(){
		return this.panierServImp.getAllPanier();
	}
	
	// http://localhost:8089/SpringMVC/panier/retrieve-panier/{panierId}
	@GetMapping("/retrieve-panier/{panierId}")  
	@ResponseBody
	private Optional<Panier> getPanier(@PathVariable("panierId") Long panierId)   
	{  
		return this.panierServImp.retrievePanier(panierId);  
	}
	
	// http://localhost:8089/SpringMVC/panier/remove-panier/{panierId}
	@DeleteMapping("/remove-panier/{panierId}")  
	@ResponseBody
	private void deleteBook(@PathVariable("bookid") Long panierId)   
	{  
		this.panierServImp.deletePanier(panierId);  
	}
	
	// http://localhost:8089/SpringMVC/panier/modify-panier	
	@PutMapping("/modify-panier")
	@ResponseBody
	public Panier modifyClient(@RequestBody Panier p) {
		return this.panierServImp.updatePanier(p);
	}

}
