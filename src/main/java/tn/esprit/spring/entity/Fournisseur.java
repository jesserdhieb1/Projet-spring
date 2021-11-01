package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of= {"idFournissuer","code","libelle"})
public class Fournisseur implements Serializable {
  

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFournissuer")
    private Long idFournissuer;
    private String code;
    private String libelle;

}
