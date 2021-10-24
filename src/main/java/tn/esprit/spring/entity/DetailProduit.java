package tn.esprit.spring.entity;

import tn.esprit.spring.enumeration.CategorieProduit;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class DetailProduit implements Serializable {
    public DetailProduit() {
    }

    public DetailProduit(Date dateDerniereModification, CategorieProduit categorieProduit) {
        this.dateDerniereModification = dateDerniereModification;
        this.CategorieProduit = categorieProduit;

    }

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


    public Long getIdDetailProduit() {
        return idDetailProduit;
    }

    public void setIdDetailProduit(Long idDetailProduit) {
        this.idDetailProduit = idDetailProduit;
    }

    public Date getDateDerniereModification() {
        return dateDerniereModification;
    }

    public void setDateDerniereModification(Date dateDerniereModification) {
        this.dateDerniereModification = dateDerniereModification;
    }

    public tn.esprit.spring.enumeration.CategorieProduit getCategorieProduit() {
        return CategorieProduit;
    }

    public void setCategorieProduit(tn.esprit.spring.enumeration.CategorieProduit categorieProduit) {
        CategorieProduit = categorieProduit;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "detailProduit{" +
                "idDetailProduit=" + idDetailProduit +
                ", dateDerniereModification=" + dateDerniereModification +
                ", CategorieProduit=" + CategorieProduit +
                '}';
    }
}
