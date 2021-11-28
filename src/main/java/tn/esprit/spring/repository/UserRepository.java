package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    @Query("SELECT U FROM User U WHERE U.email like %?1")
    User findByEmail(String email);
}
