package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table
public class Stock implements Serializable {
    public Stock() {
    }

    public Stock(int qte, int qteMin, String libelleStock) {
        this.qte = qte;
        this.qteMin = qteMin;
        this.libelleStock = libelleStock;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idStock")
    private Long idStock;
    private int qte;
    private int qteMin;
    private String libelleStock;
    @OneToMany(mappedBy = "s",cascade = CascadeType.ALL)
    private Set<Produit> produit;

    public Long getIdStock() {
        return idStock;
    }

    public void setIdStock(Long idStock) {
        this.idStock = idStock;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getQteMin() {
        return qteMin;
    }

    public void setQteMin(int qteMin) {
        this.qteMin = qteMin;
    }

    public String getLibelleStock() {
        return libelleStock;
    }

    public void setLibelleStock(String libelleStock) {
        this.libelleStock = libelleStock;
    }

    public Set<Produit> getProduit() {
        return produit;
    }

    public void setProduit(Set<Produit> produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "idStock=" + idStock +
                ", qte=" + qte +
                ", qteMin=" + qteMin +
                ", libelleStock='" + libelleStock + '\'' +
                '}';
    }
}
