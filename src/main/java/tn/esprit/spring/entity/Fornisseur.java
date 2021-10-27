package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fournisseur")
public class Fournisseur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idFournisseur")
	private long idFournisseur;
	private String nomFournisseur;
	private String adresse;
	private String email;
	private long telFournissseur;
	private String code;
	private String libelle;
	public long getIdFournisseur() {
		return idFournisseur;
	}
	public String getNomFournisseur() {
		return nomFournisseur;
	}
	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelFournissseur() {
		return telFournissseur;
	}
	public void setTelFournissseur(long telFournissseur) {
		this.telFournissseur = telFournissseur;
	}
	public void setIdFournisseur(long idFournisseur) {
		this.idFournisseur = idFournisseur;
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

}
