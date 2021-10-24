package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Fournisseur implements Serializable {
    public Fournisseur() {
    }

    public Fournisseur(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFournissuer")
    private Long idFournissuer;
    private String code;
    private String libelle;

    public Long getIdFournissuer() {
        return idFournissuer;
    }

    public void setIdFournissuer(Long idFournissuer) {
        this.idFournissuer = idFournissuer;
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

    @Override
    public String toString() {
        return "Fournisseur{" +
                "idFournissuer=" + idFournissuer +
                ", code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
