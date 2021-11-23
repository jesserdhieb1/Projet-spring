package tn.esprit.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Livreur;
import tn.esprit.spring.service.LivreurService;
import tn.esprit.spring.service.LivreurServiceImpl;

@RestController
@RequestMapping("/livreur")
public class LivreurRestController {
	@Autowired
	LivreurServiceImpl livreurService;

	// http://localhost:8090/SpringMVC/livreur/retrieve-all-livreurs
	@GetMapping("/retrieve-all-livreurs")
	@ResponseBody
	public List<Livreur> getlivreurs() {
	List<Livreur> listlivreurs = livreurService.retrieveAllLivreurs();
	return listlivreurs;
	}
	

   // Ajouter Livreur : http://localhost:8090/SpringMVC/livreur/add-livreur
		  @PostMapping("/add-livreur")
		  @ResponseBody
		  public Livreur addLivreur(@RequestBody Livreur u) {
		  Livreur Livreur = livreurService.addLivreur(u);
		  return Livreur;
		  }
		  
		  
	// http://localhost:8090/SpringMVC/livreur/remove-livreur/{livreur-id}
		   @DeleteMapping("/remove-livreur/{livreur-id}")
		   @ResponseBody
		   public void removeLivreur(@PathVariable("livreur-id") Long LivreurId) {
		   livreurService.deleteLivreur(LivreurId);
		   }
		  
   // http://localhost:8090/SpringMVC/livreur/modify-Livreur
		   @PutMapping("/modify-livreur")
		   @ResponseBody
		   public Livreur modifyLivreur(@RequestBody Livreur Livreur) {
		   return livreurService.updateLivreur(Livreur);
		   }
	  
		// http://localhost:8090/SpringMVC/livreur/retrieve-livreur/{livreur-id}
			 @GetMapping("/retrieve-livreur/{livreur-id}")
			 @ResponseBody
			 public Livreur retrievelivreur(@PathVariable("livreur-id") Long livreurId) {
			 return livreurService.retrieveLivreur(livreurId);
			  }
	
}
