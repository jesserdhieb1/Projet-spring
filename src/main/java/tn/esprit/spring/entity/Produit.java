package tn.esprit.spring.entity;

import javax.persistence.*;

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
public class Produit implements Serializable {
   //aaa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProduit")
    private Long idProduit;
    private String code;
    private String libelle;
    private float prixUnitaire;
    
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

}