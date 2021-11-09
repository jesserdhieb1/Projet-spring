package tn.esprit.spring.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.service.RayonServiceImpl;

@RestController
@RequestMapping("/rayon")
public class RayonRestController {
	@Autowired
	RayonServiceImpl rayonService;
	// http://localhost:8089/SpringMVC/rayon/retrieve-all-rayons
	@GetMapping("/retrieve-all-rayons")
	@ResponseBody
	public List<Rayon> getRayons() {
		List<Rayon> listRayons = rayonService.retrieveAllRayons();
		return listRayons;

	}
	// http://localhost:8089/SpringMVC/rayon/retrieve-rayon/8
		@GetMapping("/retrieve-rayon/{rayon-id}")
		@ResponseBody
		public Optional<Rayon> retrieveRayon(@PathVariable("rayon-id") Long rayonId) {
		return rayonService.retrieveRayon(rayonId);
		}

		// http://localhost:8089/SpringMVC/rayon/add-rayon
		@PostMapping("/add-rayon")
		@ResponseBody
		public Rayon addRayon(@RequestBody Rayon c)
		{
			Rayon rayon = rayonService.addRayon(c);
		return rayon;
		}
		// http://localhost:8089/SpringMVC/rayon/modify-rayon
		@PutMapping("/modify-rayon")
		@ResponseBody
		public Rayon modifyRayon(@RequestBody Rayon rayon) {
		return rayonService.updateRayon(rayon);
		}

}
