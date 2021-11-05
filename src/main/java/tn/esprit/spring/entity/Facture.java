package tn.esprit.spring.entity;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.entity.User;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity

@Getter
@Setter
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)	

@Table(name="facture")

public class Facture implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFacture")
    Long idFacture;
    float montantRemise;
    float montantFacture;
    @Temporal(TemporalType.DATE)
    Date dateFacture;
    boolean active;

    @ManyToOne

    User user;


    @OneToMany(mappedBy = "f",cascade = CascadeType.ALL)
    Set<DetailFacture> detailFacture;

    
}
