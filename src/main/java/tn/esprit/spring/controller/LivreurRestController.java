package tn.esprit.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Livreur;
import tn.esprit.spring.service.LivreurService;

@RestController
@RequestMapping("/livreur")
public class LivreurRestController {
	@Autowired
	LivreurService livreurService;

	// http://localhost:8089/SpringMVC/livreur/retrieve-all-livreurs
	@GetMapping("/retrieve-all-livreurs")
	@ResponseBody
	public List<Livreur> getlivreurs() {
	List<Livreur> listlivreurs = livreurService.retrieveAllLivreurs();
	return listlivreurs;
	}
	
	
	
}
