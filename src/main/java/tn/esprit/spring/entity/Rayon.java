package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of={"idRayon","code","libelle","produit"})
public class Rayon implements Serializable {
   


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRayon")
    private Long idRayon;
    private String code;
    private String libelle;
    @OneToMany(mappedBy = "rayon",cascade = CascadeType.ALL)
    private Set<Produit> produit;

   
}
