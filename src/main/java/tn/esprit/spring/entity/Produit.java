package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table
public class Produit implements Serializable {
    public Produit() {
    }

    public Produit(String code, String libelle, float prixUnitaire) {
        this.code = code;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProduit")
    private Long idClient;
    private String code;
    private String libelle;
    private float prixUnitaire;
    @OneToMany(mappedBy = "produit",cascade = CascadeType.ALL)
    private Set<DetailFacture> detailFacture;
    @ManyToOne
    private Rayon rayon;
    @ManyToOne
    private Stock stock;
    @OneToOne
    private DetailProduit Detailproduit;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Fournisseur> fornisseur;

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Set<DetailFacture> getDetailFacture() {
        return detailFacture;
    }

    public void setDetailFacture(Set<DetailFacture> detailFacture) {
        this.detailFacture = detailFacture;
    }

    public Rayon getRayon() {
        return rayon;
    }

    public void setRayon(Rayon rayon) {
        this.rayon = rayon;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public DetailProduit getDetailproduit() {
        return Detailproduit;
    }

    public void setDetailproduit(DetailProduit detailproduit) {
        Detailproduit = detailproduit;
    }

    public Set<Fournisseur> getFornisseur() {
        return fornisseur;
    }

    public void setFornisseur(Set<Fournisseur> fornisseur) {
        this.fornisseur = fornisseur;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "idClient=" + idClient +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                '}';
    }
}
