package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table
public class Facture implements Serializable {
    public Facture() {
    }

    public Facture(float montantRemise, float montantFacture, Date dateFacture, boolean active, User user) {
        this.montantRemise = montantRemise;
        this.montantFacture = montantFacture;
        this.dateFacture = dateFacture;
        this.active = active;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFacture")
    private Long idFacture;
    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateFacture;
    private boolean active;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "facture",cascade = CascadeType.ALL)
    private Set<DetailFacture> detailFacture;

    public Long getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(Long idFacture) {
        this.idFacture = idFacture;
    }

    public float getMontantRemise() {
        return montantRemise;
    }

    public void setMontantRemise(float montantRemise) {
        this.montantRemise = montantRemise;
    }

    public float getMontantFacture() {
        return montantFacture;
    }

    public void setMontantFacture(float montantFacture) {
        this.montantFacture = montantFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<DetailFacture> getDetailFacture() {
        return detailFacture;
    }

    public void setDetailFacture(Set<DetailFacture> detailFacture) {
        this.detailFacture = detailFacture;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "idFacture=" + idFacture +
                ", montantRemise=" + montantRemise +
                ", montantFacture=" + montantFacture +
                ", dateFacture=" + dateFacture +
                ", active=" + active +
                ", user=" + user +
                '}';
    }
}
