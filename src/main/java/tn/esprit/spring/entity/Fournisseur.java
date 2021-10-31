package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
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
public class Fournisseur implements Serializable {


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

}
