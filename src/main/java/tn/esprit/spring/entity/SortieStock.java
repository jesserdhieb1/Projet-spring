
package tn.esprit.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@ToString(of= {"idSortieStock","qte","dateSortie","libelleStock","pS"})
public class SortieStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idSortieStock")
    private long idSortieStock;
    private int qte;
    private Date dateSortie;
    private String libelleStock;
    @OneToMany (mappedBy ="SortieStock")
    private List<Produit> pS;
  
}