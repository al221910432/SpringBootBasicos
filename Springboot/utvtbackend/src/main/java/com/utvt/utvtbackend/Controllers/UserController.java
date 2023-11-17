package com.utvt.utvtbackend.Controllers;

import com.sun.istack.NotNull;
import com.utvt.utvtbackend.Models.User;
import com.utvt.utvtbackend.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping(value = "/")
    public String HelloWorld(){
        return "Hello World from the API REST";
    }


    /*Controller that respond to the findAll method*/
    @GetMapping("/users")
    public ResponseEntity<List<User>> findAll(){
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }



    /*Controller that respond to the findById method*/
    @GetMapping("users/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = userService.findById(id);
        if(user!= null) {
            return ResponseEntity.ok(user);
        }
            return  ResponseEntity.notFound().build();
    }

    /*Controller that respond to the save method*/

    @PostMapping("users/create")
    public ResponseEntity<User> save(@Validated @RequestBody User user){
        User savedUser = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }


    /*Method that repond to the update method in user service*/
    @PutMapping("users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long id, @RequestBody User user){
        User updateUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updateUser);
    }

    /*Metodo por arreglar :v */
    /*@GetMapping("users/search")
    public List<User> searchUsersByName(@RequestParam("name") String name) {
        return userService.searchUsersByName(name);
    }
    */

}
