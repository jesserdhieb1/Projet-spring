package tn.esprit.spring.entity;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;

@Entity
@Table(name="detailfacture")

@Getter
@Setter
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

public class DetailFacture implements Serializable {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailFacture")
    
    Long idDetailFacture;
    
    int qte;
    float prixTotal;
    int porcentageRemise;
    float montantRemise;
    
    @ManyToOne
    Facture f;
    
    @ManyToOne
    Produit produit;
    
    @ManyToOne
    Panier p;
    
}
