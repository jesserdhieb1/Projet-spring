package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import tn.esprit.spring.enumeration.CategorieUser;
import tn.esprit.spring.enumeration.Profession;
import tn.esprit.spring.enumeration.Role;

import java.util.Set;

@Entity
@Table
public class User implements Serializable {
    public User() {
    }

    public User(String nom, String prenom, Date dateNaissance, String email, String password, CategorieUser categorieUser, Profession profession) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.password = password;
        CategorieUser = categorieUser;
        Profession = profession;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUser")
    private Long idUser;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String email;
    private String password;
    private CategorieUser CategorieUser;
    private Profession Profession;
    private Role role;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Set<Facture> facture;

    @OneToMany(mappedBy = "user_avis",cascade = CascadeType.ALL)
    private Set<AvisUser> avisUser;


    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public tn.esprit.spring.enumeration.CategorieUser getCategorieUser() {
        return CategorieUser;
    }

    public void setCategorieUser(tn.esprit.spring.enumeration.CategorieUser categorieUser) {
        CategorieUser = categorieUser;
    }

    public tn.esprit.spring.enumeration.Profession getProfession() {
        return Profession;
    }

    public void setProfession(tn.esprit.spring.enumeration.Profession profession) {
        Profession = profession;
    }

    public Set<Facture> getFacture() {
        return facture;
    }

    public void setFacture(Set<Facture> facture) {
        this.facture = facture;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", CategorieUser=" + CategorieUser +
                ", Profession=" + Profession +
                ",Role=" +role+
                '}';
    }
}
