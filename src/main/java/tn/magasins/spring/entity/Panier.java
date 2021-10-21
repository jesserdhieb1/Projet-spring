package tn.magasins.spring.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="panier")
public class Panier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPanier;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="panier")
	private Set<DetailFacture> detailFacture;
	
	private long prixTotal;
	
	private float montantRemise;

	public Long getIdPanier() {
		return idPanier;
	}

	public void setIdPanier(Long idPanier) {
		this.idPanier = idPanier;
	}

	public Set<DetailFacture> getDetailFacture() {
		return detailFacture;
	}

	public void setDetailFacture(Set<DetailFacture> detailFacture) {
		this.detailFacture = detailFacture;
	}

	public long getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(long prixTotal) {
		this.prixTotal = prixTotal;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	
	
	

}
