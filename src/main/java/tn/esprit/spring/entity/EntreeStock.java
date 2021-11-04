package tn.esprit.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.FieldDefaults;
@Entity
@Table(name="EntreeStock")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of= {"idEntreeStock","qte","dateEntree","libelleStock","pE","f"})
@FieldDefaults(level=AccessLevel.PRIVATE)
public class EntreeStock implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idEntreeStock")
     long idEntreeStock;
    int qte;
    Date dateEntree;
     String libelleStock;
    @OneToMany (mappedBy ="EntreeStock")
    List<Produit> pE;
    @OneToOne
     Fournisseur f;


}