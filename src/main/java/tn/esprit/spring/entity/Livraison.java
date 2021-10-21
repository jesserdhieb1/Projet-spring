package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table( name = "Livraison")
public class Livraison implements Serializable {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY )
@Column(name="idLvr")
private Long idLvr;
@OneToOne
private Facture F ;
@ManyToOne
private Livreur L;
private Date dateLivraisonDate;
private String adresseLvr;
public Long getIdLvr() {
	return idLvr;
}
public void setIdLvr(Long idLvr) {
	this.idLvr = idLvr;
}
public Facture getF() {
	return F;
}
public void setF(Facture f) {
	F = f;
}
public Livreur getL() {
	return L;
}
public void setL(Livreur l) {
	L = l;
}
public Date getDateLivraisonDate() {
	return dateLivraisonDate;
}
public void setDateLivraisonDate(Date dateLivraisonDate) {
	this.dateLivraisonDate = dateLivraisonDate;
}
public String getAdresseLvr() {
	return adresseLvr;
}
public void setAdresseLvr(String adresseLvr) {
	this.adresseLvr = adresseLvr;
}
@Override
public String toString() {
	return "Livraison [idLvr=" + idLvr + ", F=" + F + ", L=" + L + ", dateLivraisonDate=" + dateLivraisonDate
			+ ", adresseLvr=" + adresseLvr + "]";
}
public Livraison(Long idLvr, Facture f, Livreur l, Date dateLivraisonDate, String adresseLvr) {
	super();
	this.idLvr = idLvr;
	F = f;
	L = l;
	this.dateLivraisonDate = dateLivraisonDate;
	this.adresseLvr = adresseLvr;
}
public Livraison(Facture f, Livreur l, Date dateLivraisonDate, String adresseLvr) {
	super();
	F = f;
	L = l;
	this.dateLivraisonDate = dateLivraisonDate;
	this.adresseLvr = adresseLvr;
}
public Livraison() {
	super();
}



}
