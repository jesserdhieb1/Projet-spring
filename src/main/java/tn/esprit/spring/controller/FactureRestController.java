package tn.esprit.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.service.FactureServiceImp;

@RestController
@RequestMapping("/Facture")
public class FactureRestController {
	
	@Autowired
	FactureServiceImp fs;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/add-facture/{user_id}")
	@ResponseBody
	public Facture add_facture(@RequestBody Facture f, @PathVariable Long user_id) {
		return this.fs.addFacture(f, user_id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/retreive-all-factures")
	@ResponseBody
	public List<Facture> retreive_all_factures() {
		return this.fs.getAllFacture();
	}
	
	
}
