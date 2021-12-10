package tn.esprit.spring.entity;

import lombok.Getter;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Set;

@Getter
public class ModelUser{
    private Long idUSer;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private String password;
    private tn.esprit.spring.enumeration.CategorieUser CategorieUser;
    private tn.esprit.spring.enumeration.Profession Profession;
    private String picture;
    private Integer phoneNumber;
    private String adresse;
    private String role;
    private Set<Facture> facture;
    private Set<AvisUser> avisUser;
}
