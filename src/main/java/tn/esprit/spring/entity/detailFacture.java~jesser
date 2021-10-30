package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class DetailFacture implements Serializable {
    public DetailFacture() {
    }

    public DetailFacture(int qte, float prixTotal, int porcentageRemise, float montantRemise, Facture facture) {
        this.qte = qte;
        this.prixTotal = prixTotal;
        this.porcentageRemise = porcentageRemise;
        this.montantRemise = montantRemise;
        this.facture = facture;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailFacture")
    private Long idDetailFacture;
    private int qte;
    private float prixTotal;
    private int porcentageRemise;
    private float montantRemise;
    @ManyToOne
    private Facture facture;
    @ManyToOne
    private Produit produit;

    public Long getIdDetailFacture() {
        return idDetailFacture;
    }

    public void setIdDetailFacture(Long idDetailFacture) {
        this.idDetailFacture = idDetailFacture;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public int getPorcentageRemise() {
        return porcentageRemise;
    }

    public void setPorcentageRemise(int porcentageRemise) {
        this.porcentageRemise = porcentageRemise;
    }

    public float getMontantRemise() {
        return montantRemise;
    }

    public void setMontantRemise(float montantRemise) {
        this.montantRemise = montantRemise;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "detailFacture{" +
                "idDetailFacture=" + idDetailFacture +
                ", qte=" + qte +
                ", prixTotal=" + prixTotal +
                ", porcentageRemise=" + porcentageRemise +
                ", montantRemise=" + montantRemise +
                ", facture=" + facture +
                '}';
    }
}
