package nl.saxion.webapps.lecturedemo1.service;

import com.sun.tools.javac.tree.JCTree;
import nl.saxion.webapps.lecturedemo1.moduls.User;
import nl.saxion.webapps.lecturedemo1.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public boolean add(User user) {
        for (User e : userRepository.findAll()) {
            if (e.getEmail().equals(user.getEmail())) {
                return false;
            }
        }
        userRepository.save(user);
        return true;
    }

    public Boolean confirm(User user) {
        for (User e : userRepository.findAll()) {
            if (e.getEmail().equals(user.getEmail()) && e.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}