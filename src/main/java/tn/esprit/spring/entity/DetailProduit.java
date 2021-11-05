package tn.esprit.spring.entity;

import tn.esprit.spring.enumeration.CategorieProduit;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor

@ToString
public class DetailProduit implements Serializable {
 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailProduit")
    private Long idDetailProduit;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    @Enumerated(EnumType.STRING)
    private CategorieProduit CategorieProduit;
    @OneToOne(mappedBy = "Detailproduit",cascade = CascadeType.ALL)
    private Produit produit;


}
