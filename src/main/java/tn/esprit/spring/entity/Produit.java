package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@ToString

public class Produit implements Serializable {
   

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
    private EntreeStock EntreeStock;
    @ManyToOne
    private SortieStock SortieStock;
    @OneToOne
    private DetailProduit Detailproduit;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Fournisseur> fornisseur;

    @OneToMany(mappedBy = "produit_avis",cascade = CascadeType.ALL)
    private Set<AvisUser> avisProduit;

   
}
