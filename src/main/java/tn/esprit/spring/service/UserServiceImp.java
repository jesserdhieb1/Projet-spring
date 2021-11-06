package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.UserRepository;

import java.util.List;
import java.util.Optional;

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
}
