package tn.esprit.spring.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Livreur")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Livreur implements Serializable {
@Autowired
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="idLiv")
private Long idLiv; 
private String NomLiv;
private String PrenomLiv;
private String VilleLiv;
private String AdresseLiv;
private String MdpLiv;
private int TelLiv;
private Double LngLiv;
private Double LatLiv;
@OneToMany(mappedBy="L")
private List <Livraison> ListLivraisons;



}
