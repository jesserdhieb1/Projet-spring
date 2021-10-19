package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import antlr.collections.List;

@Entity
public class Client implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="idClient")
	private Long idClient;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String email;
	private String password;
	private CategorieClient CategorieClient;
	private Profession Profession;
	
	@OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
	private Set<Facture> facture;
	
}
