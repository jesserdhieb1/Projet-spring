package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import tn.esprit.spring.enumeration.CategorieClient;
import tn.esprit.spring.enumeration.Profession;
import java.util.Set;

@Entity
@Table
public class Client implements Serializable {
    public Client() {
    }

    public Client(String nom, String prenom, Date dateNaissance, String email, String password, CategorieClient categorieClient, Profession profession) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.password = password;
        CategorieClient = categorieClient;
        Profession = profession;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    private Long idClient;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String email;
    private String password;
    private CategorieClient CategorieClient;
    private Profession Profession;

    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
    private Set<Facture> facture;

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
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

    public tn.esprit.spring.enumeration.CategorieClient getCategorieClient() {
        return CategorieClient;
    }

    public void setCategorieClient(tn.esprit.spring.enumeration.CategorieClient categorieClient) {
        CategorieClient = categorieClient;
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

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", CategorieClient=" + CategorieClient +
                ", Profession=" + Profession +
                '}';
    }
}
