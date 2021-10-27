package tn.esprit.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="SortieStock")
public class SortieStock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idSortieStock")
	private long idSortieStock;
	private int qte;
	private Date dateSortie;
	private String libelleStock;
	@OneToMany (mappedBy ="sS")
	private List<Produit> pS;
	public long getIdStock() {
		return idSortieStock;
	}
	public void setIdStock(long idStock) {
		this.idSortieStock = idStock;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}

	
	public String getLibelleStock() {
		return libelleStock;
	}
	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}
	public Date getDateEntree() {
		return dateSortie;
	}
	public void setDateEntree(Date dateEntree) {
		this.dateSortie = dateEntree;
	}
}
