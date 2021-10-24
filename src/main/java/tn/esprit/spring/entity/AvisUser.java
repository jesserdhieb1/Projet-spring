package tn.esprit.spring.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table
public class AvisUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAvisUser")
    private Long idAvisUser;
    @Temporal(TemporalType.DATE)
    private Date datePublicationAvis;
    private String description;
    private int note;
    private int NBP;
    private int NBC;

    @ManyToOne
    User user_avis;

    @ManyToOne
    Produit produit_avis;

    @ManyToOne
    AvisUser avisUser;
   @OneToMany(mappedBy = "avisUser",cascade = CascadeType.ALL)
   private Set<AvisUser> SousAvis;

}
