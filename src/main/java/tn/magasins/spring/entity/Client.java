package tn.magasins.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="client")
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient; // Clé primaire
	private String nom;
	private String prenom;
	private float email;
	private float password;
	@Enumerated(EnumType.STRING)
	private CategorieClient categorieClient;
	@Enumerated(EnumType.STRING)
	private Profession proffesion;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
	private Set<Facture> facture;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
	private Set<Avis> avis;
	
	

	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public float getEmail() {
		return email;
	}
	public void setEmail(float email) {
		this.email = email;
	}
	public float getPassword() {
		return password;
	}
	public void setPassword(float password) {
		this.password = password;
	}
	public CategorieClient getCategorieClient() {
		return categorieClient;
	}
	public void setCategorieClient(CategorieClient categorieClient) {
		this.categorieClient = categorieClient;
	}
	public Profession getProffesion() {
		return proffesion;
	}
	public void setProffesion(Profession proffesion) {
		this.proffesion = proffesion;
	}
	

}
