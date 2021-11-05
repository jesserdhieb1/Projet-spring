package tn.esprit.spring.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.entity.DetailFacture;

@Entity
@Table(name="panier")
@Getter
@Setter
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)	


public class Panier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idPanier;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="p")
	 Set<DetailFacture> detailFacture;
	
	 long prixTotal;
	
	 float montantRemise;

}
