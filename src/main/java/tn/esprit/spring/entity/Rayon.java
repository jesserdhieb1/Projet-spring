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
public class Rayon implements Serializable {
    public Rayon() {
    }

    public Rayon(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRayon")
    private Long idRayon;
    private String code;
    private String libelle;
    @OneToMany(mappedBy = "rayon",cascade = CascadeType.ALL)
    private Set<Produit> produit;

    public Long getIdRayon() {
        return idRayon;
    }

    public void setIdRayon(Long idRayon) {
        this.idRayon = idRayon;
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

    public Set<Produit> getProduit() {
        return produit;
    }

    public void setProduit(Set<Produit> produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Rayon{" +
                "idRayon=" + idRayon +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
