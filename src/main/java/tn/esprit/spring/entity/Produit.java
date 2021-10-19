package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Produit implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="idClient")
	private Long idClient;
	private String code;
	private String libelle;
	private float prixUnitaire;
	@OneToMany(mappedBy = "produit",cascade = CascadeType.ALL)
	private Set<detailFacture> detailFacture;
	@ManyToOne
	private Rayon rayon;
	@ManyToOne
	private Stock stock;
	@OneToOne
	private DetailProduit Detailproduit;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Fornisseur> fornisseur;
	
}
