package tn.esprit.spring.controller;
import java.util.List;
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

import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.entity.Livraison;
import tn.esprit.spring.entity.Livreur;
import tn.esprit.spring.repository.FactureRepository;
import tn.esprit.spring.repository.LivreurRepository;
import tn.esprit.spring.service.FactureServiceImp;
import tn.esprit.spring.service.LivraisonServiceImpl;
import tn.esprit.spring.service.LivreurServiceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/livraison")
public class LivraisonRestController {
	@Autowired
	LivraisonServiceImpl livraisonService;
	LivreurRepository lr;
	@Autowired
	LivreurServiceImpl ls;
	@Autowired
	FactureServiceImp fs;
	@Autowired
	FactureRepository fr;

	// http://localhost:8090/SpringMVC/livraison/retrieve-all-livraisons
	@GetMapping("/retrieve-all-livraisons")
	@ResponseBody
	public List<Livraison> getlivraisons() {
	List<Livraison> listlivraisons = livraisonService.retrieveAllLivraisons();
	return listlivraisons;
	}
	

     //http://localhost:8090/SpringMVC/livraison/add-livraison
	      @CrossOrigin(origins = "*", allowedHeaders = "*")
		  @PostMapping("/add-livraison/{livreur-id}/{facture-id}")
		  @ResponseBody
		  
		  
		  public Livraison addlivraison(@RequestBody Livraison u,@PathVariable("livreur-id") Long lid
				  ,@PathVariable("facture-id") Long fid)
		  {
	    	    System.out.println("la valeur de lid est"+lid);
	    	  Livreur l= (Livreur) ls.retrieveLivreur(lid);
	    	  Facture f= fr.findById(fid).get();
	    	  u.setL(l);
	    	  u.setF(f);
		  Livraison livraison = livraisonService.addLivraison(u);
		  
		  return livraison;
		  }
		  
		  
	// http://localhost:8090/SpringMVC/livraison/remove-livraison/{livraison-id}
		   @DeleteMapping("/remove-livraison/{livraison-id}")
		   @CrossOrigin(origins = "*", allowedHeaders = "*")
		   @ResponseBody
		   public void removelivraison(@PathVariable("livraison-id") Long livraisonId) {
		   livraisonService.deleteLivraison(livraisonId);
		   }
		  
   // http://localhost:8090/SpringMVC/livraison/modify-livraison
		   @PutMapping("/modify-livraison")
		   @ResponseBody
		   public Livraison modifylivraison(@RequestBody Livraison livraison) {
		   return livraisonService.updateLivraison(livraison);
		   }
	  
		// http://localhost:8090/SpringMVC/livraison/retrieve-livraison/{livraison-id}
			 @GetMapping("/retrieve-livraison/{livraison-id}")
			 @ResponseBody
			 public Livraison retrievelivraison(@PathVariable("livraison-id") Long livraisonId) {
			 return livraisonService.retrieveLivraison(livraisonId);
			  }
			 
			// http://localhost:8090/SpringMVC/livraison/GetLivraisonByIdLivreur/{livreur-id}
			 @GetMapping("/GetLivraisonByIdLivreur/{livreur-id}")
			 @ResponseBody
			 public List<Livraison> GetLivraisonByIdLivreur(@PathVariable("livreur-id") int id) {
				 List<Livraison> listlivraisons = livraisonService.FindByIdLivreur(Long.valueOf(id));
					return listlivraisons;			 
				 }
}
