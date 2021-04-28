package nl.saxion.webapps.lecturedemo1.repository;

import nl.saxion.webapps.lecturedemo1.moduls.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
