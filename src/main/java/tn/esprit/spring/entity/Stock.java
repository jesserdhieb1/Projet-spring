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

import lombok.experimental.FieldDefaults;
@Entity
@Table(name="Stock")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of= {"iStock","qte","date","libelleStock","pE","f"})
@FieldDefaults(level=AccessLevel.PRIVATE)
public class EntreeStock implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idStock")
     long idStock;
    int qte;
    Date date;
     String libelleStock;
    @OneToMany (mappedBy ="Stock")
    List<Produit> pE;
    @OneToOne
     Fournisseur f;


}