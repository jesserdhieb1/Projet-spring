package tn.esprit.spring.service;

import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.enumeration.CategorieUser;
import tn.esprit.spring.enumeration.Role;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserService {
    List<User> retrivaAllUsers();
    User addUser(User u);
    void delteUser(Long id);
    User updateUser(User u);
    Optional<User>retriveUser(Long id);
    Optional<User> FindUserByEmail(String email);
    boolean MailExists(String email);
    boolean Authontification(String email,String passwd);
    User ChangeRole(Role role,Long id);
    User ChangeCategorie(CategorieUser categorie, Long id);
    User AssignFactureToUser(Facture F,Long idUser );
    Set<Facture> AfficherFacturesParUser(Long idUser);
}
