package tn.magasins.spring.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="avis")
public class Avis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvis; // Clé primaire
	
	@ManyToOne
	private Client client;//fk client
	
	@ManyToOne
	private Produit produit;//fk produit

	private Long likeValue;
	private String commentaire;
	private Date dateCreation;
	private Date dateModification;
	public Long getIdAvis() {
		return idAvis;
	}
	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}
	public Long getLikeValue() {
		return likeValue;
	}
	public void setLikeValue(Long likeValue) {
		this.likeValue = likeValue;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateModification() {
		return dateModification;
	}
	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}
	public Avis() {
		super();
	}
	public Avis(Long likeValue, String commentaire, Date dateCreation, Date dateModification) {
		super();
		this.likeValue = likeValue;
		this.commentaire = commentaire;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}
	public Avis(Long idAvis, Long likeValue, String commentaire, Date dateCreation, Date dateModification) {
		super();
		this.idAvis = idAvis;
		this.likeValue = likeValue;
		this.commentaire = commentaire;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}
	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", likeValue=" + likeValue + ", commentaire=" + commentaire
				+ ", dateCreation=" + dateCreation + ", dateModification=" + dateModification + "]";
	}
	
	
		
	
	
	
	
}
