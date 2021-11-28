package tn.esprit.spring.service;

import tn.esprit.spring.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> retrivaAllUsers();
    User addUser(User u);
    void delteUser(Long id);
    User updateUser(User u);
    Optional<User>retriveUser(Long id);
    User FindUserByEmail(String email);
    boolean MailExists(String email);
    boolean Authontification(String email,String passwd);
}
