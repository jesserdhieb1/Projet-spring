package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.enumeration.CategorieUser;
import tn.esprit.spring.enumeration.Role;
import tn.esprit.spring.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository){this.userRepository=userRepository;}

    @Override
    public List<User> retrivaAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public User addUser(User u) {
        userRepository.save(u);
        return u;
    }

    @Override
    public void delteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User u) {
        userRepository.save(u);
        return u;
    }

    @Override
    public Optional<User> retriveUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> FindUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public boolean MailExists(String email) {
        if (userRepository.findByEmail(email).isPresent()){
            return true;
        }
        return false;
    }

    @Override
    public boolean Authontification(String email, String passwd) {
        Optional<User> U =userRepository.findByEmail(email);
        if (U.isPresent()){
            if (U.get().getPassword()==passwd){
                return true;
            }
        }
        return false;
    }

    @Override
    public User ChangeRole(Role role, Long id) {
        return userRepository.ChangeRole(role,id);
    }

    @Override
    public User ChangeCategorie(CategorieUser categorie, Long id) {
        return userRepository.ChangeCategorie(categorie,id);
    }


}
