package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.Date;
import tn.esprit.spring.entity.Facture;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Livraison")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Livraison implements Serializable {
	@Autowired
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


}
