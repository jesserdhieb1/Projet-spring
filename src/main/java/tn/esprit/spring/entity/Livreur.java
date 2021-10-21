package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table( name = "Livreur")
public class Livreur implements Serializable {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="idLiv")
private Long idLiv; 
private String NomLiv;
private String PrenomLiv;
private String VilleLiv;
private String AdresseLiv;
private String MdpLiv;
private Long TelLiv;
private Float LngLiv;
private Float LatLiv;
@OneToMany(mappedBy="L")
private List <Livraison> ListLivraisons;
public Long getIdLiv() {
	return idLiv;
}
public void setIdLiv(Long idLiv) {
	this.idLiv = idLiv;
}
public String getNomLiv() {
	return NomLiv;
}
public void setNomLiv(String nomLiv) {
	NomLiv = nomLiv;
}
public String getPrenomLiv() {
	return PrenomLiv;
}
public void setPrenomLiv(String prenomLiv) {
	PrenomLiv = prenomLiv;
}
public String getVilleLiv() {
	return VilleLiv;
}
public void setVilleLiv(String villeLiv) {
	VilleLiv = villeLiv;
}
public String getAdresseLiv() {
	return AdresseLiv;
}
public void setAdresseLiv(String adresseLiv) {
	AdresseLiv = adresseLiv;
}
public String getMdpLiv() {
	return MdpLiv;
}
public void setMdpLiv(String mdpLiv) {
	MdpLiv = mdpLiv;
}
public Long getTelLiv() {
	return TelLiv;
}
public void setTelLiv(Long telLiv) {
	TelLiv = telLiv;
}
public Float getLngLiv() {
	return LngLiv;
}
public void setLngLiv(Float lngLiv) {
	LngLiv = lngLiv;
}
public Float getLatLiv() {
	return LatLiv;
}
public void setLatLiv(Float latLiv) {
	LatLiv = latLiv;
}
public List<Livraison> getListLivraisons() {
	return ListLivraisons;
}
public void setListLivraisons(List<Livraison> listLivraisons) {
	ListLivraisons = listLivraisons;
}



}
