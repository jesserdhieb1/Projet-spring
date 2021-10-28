package tn.esprit.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="EntreeStock")
public class EntreeStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idEntreeStock")
    private long idEntreeStock;
    private int qte;
    private Date dateEntree;
    private String libelleStock;
    @OneToMany (mappedBy ="sE")
    private List<Produit> pE;
    @OneToOne
    private Fournisseur f;

    public long getIdStock() {
        return idEntreeStock;
    }
    public void setIdStock(long idStock) {
        this.idEntreeStock = idStock;
    }
    public int getQte() {
        return qte;
    }
    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getLibelleStock() {
        return libelleStock;
    }
    public void setLibelleStock(String libelleStock) {
        this.libelleStock = libelleStock;
    }
    public Date getDateEntree() {
        return dateEntree;
    }
    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

}