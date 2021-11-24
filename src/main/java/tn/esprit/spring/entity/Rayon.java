package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of={"idRayon","code","libelle","produit"})
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Rayon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRayon")
    Long idRayon;
    String code;
     String libelle;
    @OneToMany(mappedBy = "rayon",cascade = CascadeType.ALL)
    Set<Produit> produit;

   
}
