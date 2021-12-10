package tn.esprit.spring.controller;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.ModelUser;
import tn.esprit.spring.entity.Role;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.enumeration.CategorieUser;
import tn.esprit.spring.enumeration.Profession;
import tn.esprit.spring.enumeration.RoleName;
import tn.esprit.spring.service.UserServiceImp;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController

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
/*    @PostMapping("modify-user-1")
    public User modifyUser1(@RequestBody ModelUser u){
        try{
        User user= new User();
        userService.assignModelToUser(u,user);
        return userService.updateUser(user);}
        catch (Exception e){
            System.out.println("exeption : "+e);
            return null;
        }
    }*/

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
    public User ChangeUserRole(@RequestBody RoleUser roleUser ){
       try {
           RoleName roleName = RoleName.valueOf(roleUser.get_Role());
           return userService.ChangeRole(roleName,roleUser.get_idUser());
       }
       catch (Exception e){
           System.out.println(e);
           System.out.println("role"+roleUser.get_Role());
           System.out.println("role"+roleUser.get_idUser());
           System.out.println("roleUser : "+roleUser.toString());
       }
       return null;
    }

}
@Getter
@ToString
class RoleUser{
    private Long _idUser;
    private String _Role;
}

