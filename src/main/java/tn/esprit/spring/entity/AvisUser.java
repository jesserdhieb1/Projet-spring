package tn.esprit.spring.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tn.esprit.spring.enumeration.TypeAvis;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@ToString
public class AvisUser {

    public AvisUser(Date datePublicationAvis, String description, int note, int NBP, int NBC) {
        this.datePublicationAvis = datePublicationAvis;
        this.description = description;
        this.note = note;
        this.NBP = NBP;
        this.NBC = NBC;
    }

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
    private TypeAvis type;

    @ManyToOne
    User user_avis;

    @ManyToOne
    Produit produit_avis;

    @ManyToOne
    AvisUser avisUser;
   @OneToMany(mappedBy = "avisUser",cascade = CascadeType.ALL)
   private Set<AvisUser> SousAvis;

}
