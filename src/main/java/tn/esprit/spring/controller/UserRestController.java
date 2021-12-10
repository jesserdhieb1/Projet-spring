package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Role;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.UserServiceImp;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserRestController {
    @Autowired
    UserServiceImp userService;

    @GetMapping("/retrive-all-users")
    public List<User> getAllUsers(){
        return userService.retrivaAllUsers();
    }

    @GetMapping("/retrive-user/{user-id}")
    public Optional<User> retriveUser(@PathVariable("user-id") Long id){
        return userService.retriveUser(id);
    }

    @PostMapping("/add-user")
    public User addUser(@RequestBody User u){
        userService.addUser(u);
        return u;
    }

    @DeleteMapping("remove-user/{user-id}")
    public void deleteUser(@PathVariable("user-id") Long id){
        userService.delteUser(id);
    }

    @PutMapping("modify-user")
    public User modifyUser(@RequestBody User u){
        userService.updateUser(u);
        return u;
    }

    @GetMapping("/find-user-by-email")
    public Optional<User> find_user_by_email(@RequestParam String email){
        return userService.FindUserByEmail(email);
    }

    @GetMapping("/email-exists")
    public boolean MailExists(@RequestParam String email){
        return userService.MailExists(email);
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user){
        String msg="";
        Optional<User> userExists = userService.FindUserByEmail(user.getEmail());
        if (userExists.isPresent()){
            msg = "user already registered with the email provided";
        }
        else {
            msg="200 OK";
            userService.addUser(user);
        }
        return msg;
    }

    @PostMapping("/change-role-user")
    public User ChangeUserRole(@RequestBody User user){
        //return userService.ChangeRole(user.getRole().,user.getIdUser());
    }

}
