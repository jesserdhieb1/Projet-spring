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
import lombok.AccessLevel;


import lombok.experimental.FieldDefaults;
@Entity
@Table(name="Stock")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of= {"id","name,","qte","date","libelleStock"})
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Stock implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idStock")
     long id;
    String name;
    int qte;
    
    int qteMin;
    Date date;
     String libelleStock;
     String logo;
    @OneToMany (mappedBy ="s")
    List<Produit> pE;
 


}