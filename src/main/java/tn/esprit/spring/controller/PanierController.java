package tn.esprit.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Panier;
import tn.esprit.spring.service.PanierServiceImp;

@RestController
@RequestMapping("/Panier")
public class PanierController {

	@Autowired  
	PanierServiceImp panierServImp;
	
	@GetMapping("/panier")
	List<Panier> getAllPaniers(){
		return panierServImp.getAllPanier();
	}
	@GetMapping("/panier/{panierId}")  
	private Optional<Panier> getBooks(@PathVariable("panierId") Long panierId)   
	{  
		return panierServImp.retrievePanier(panierId);  
	}
	
	@DeleteMapping("/book/{bookid}")  
	private void deleteBook(@PathVariable("bookid") int bookid)   
	{  
	booksService.delete(bookid);  
	}  
}
