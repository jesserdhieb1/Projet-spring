package tn.magasins.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="produit")

public class Produit implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Client_ID")
	private Long idClient; // Clé primaire
	private String code;
	private String libelle;
	private float prixUnitaire;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Fournisseur> fournisseur;
	@OneToOne
	private DetailProduit detailproduit;
	@ManyToOne
	Rayon rayon;
	@ManyToOne
	DetailFacture detailfacture;
	@ManyToOne
	Stock stock;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="produit")
	private Set<Avis> avis;

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Set<Fournisseur> getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Set<Fournisseur> fournisseur) {
		this.fournisseur = fournisseur;
	}

	public DetailProduit getDetailproduit() {
		return detailproduit;
	}

	public void setDetailproduit(DetailProduit detailproduit) {
		this.detailproduit = detailproduit;
	}

	public Rayon getRayon() {
		return rayon;
	}

	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}

	public DetailFacture getDetailfacture() {
		return detailfacture;
	}

	public void setDetailfacture(DetailFacture detailfacture) {
		this.detailfacture = detailfacture;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Set<Avis> getAvis() {
		return avis;
	}

	public void setAvis(Set<Avis> avis) {
		this.avis = avis;
	}
	
	
	
	
	
	}