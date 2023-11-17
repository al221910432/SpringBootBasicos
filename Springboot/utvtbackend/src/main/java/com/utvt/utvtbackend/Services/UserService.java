package com.utvt.utvtbackend.Services;

import com.utvt.utvtbackend.Models.User;
import com.utvt.utvtbackend.Repositories.UserRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    /*Method findAll to find all the users items */
    public List<User>findAll(){
        return userRepository.findAll();
    }
    /*Method findBy for search and user item by Id*/
    public User findById(Long id){
        return userRepository.findById(id).orElse(null);
    }
    /*Method save to create a new user item*/
    public User save(User user){
        return userRepository.save(user);
    }

    /*Method to update an user item*/
    public User updateUser(Long id, User user){
        User userToUpdate = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User"));
        userToUpdate.setName(user.getName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setAge(user.getAge());
        userToUpdate.setGender(user.getGender());

        return userRepository.save(userToUpdate);
    }


    public List<User> searchUsersByName(String name) {
        return userRepository.findUserByName(name);
    }
}
