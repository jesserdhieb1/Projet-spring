package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class detailFacture implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="idDetailFacture")
	private Long idDetailFacture;
	private int qte;
	private float prixTotal;
	private int porcentageRemise;
	private float montantRemise;
	@ManyToOne
	private Facture facture;
	@ManyToOne
	private Produit produit;

}
