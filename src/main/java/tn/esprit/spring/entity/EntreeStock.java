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

@Entity
@Table(name="EntreeStock")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of= {"idEntreeStock","qte","dateEntree","libelleStock","pE","f"})
public class EntreeStock implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idEntreeStock")
    private long idEntreeStock;
    private int qte;
    private Date dateEntree;
    private String libelleStock;
    @OneToMany (mappedBy ="EntreeStock")
    private List<Produit> pE;
    @OneToOne
    private Fournisseur f;


}