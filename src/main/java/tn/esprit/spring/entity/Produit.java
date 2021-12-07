package tn.esprit.spring.entity;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Produit implements Serializable {
   //aaa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String code;
    private String libelle;
    private String picture;
    private String description;
    private Long nbrLike;
    private float prixUnitaire;
   
    @JsonManagedReference
    @OneToMany(mappedBy = "produit",cascade = CascadeType.ALL)
    private Set<DetailFacture> detailFacture;
    
    @ManyToOne
    private Rayon rayon;
    
    @ManyToOne
    private Stock s;
    
    @OneToOne
    private DetailProduit Detailproduit;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Fournisseur> fornisseur;

    @OneToMany(mappedBy = "produit_avis",cascade = CascadeType.ALL)
    private Set<AvisUser> avisProduit;
    @Column(columnDefinition = "int default 0")
    private Long pourcentageRemise;

}