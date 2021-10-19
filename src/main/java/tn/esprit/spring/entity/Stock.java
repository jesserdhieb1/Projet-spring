package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Stock implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="idStock")
	private Long idStock;
	private int qte;
	private int qteMin;
	private String libelleStock;
	@OneToMany(mappedBy = "stock",cascade = CascadeType.ALL)
	private Set<Produit> produit;
}
