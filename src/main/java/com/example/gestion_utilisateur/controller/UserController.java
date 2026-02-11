package com.example.gestion_utilisateur.controller;



// import com.example.gestion_utilisateur.model.User;
//  import com.example.gestion_utilisateur.service.UserService;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// import java.util.Optional;

// /**
//  * Contrôleur REST pour gérer les utilisateurs.
//  * Fournit des endpoints pour CRUD via HTTP.
//  */
// @RestController
// @RequestMapping("/users")
// public class UserController {

//     private final UserService userService;

//     public UserController(UserService userService) {
//         this.userService = userService;
//     }

//     /**
//      * Ajoute un utilisateur.
//      */
//     @PostMapping
//     public User addUser(@RequestBody User user) {
//         return userService.addUser(user);
//     }

//     /**
//      * Récupère un utilisateur par ID.
//      */
//     @GetMapping("/{id}")
//     public Optional<User> getUser(@PathVariable Long id) {
//         return userService.getUser(id);
//     }

//     /**
//      * Liste tous les utilisateurs.
//      */
//     @GetMapping
//     public List<User> getAllUsers() {
//         return userService.getAllUsers();
//     }

//     /**
//      * Supprime un utilisateur par ID.
//      */
//     @DeleteMapping("/{id}")
//     public void deleteUser(@PathVariable Long id) {
//         userService.deleteUser(id);
//     }
// }




import com.example.gestion_utilisateur.model.User;
import com.example.gestion_utilisateur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Contrôleur REST pour gérer les utilisateurs.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // GET /users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // GET /users/{id}
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        // return userService.getUser(id);
        return userService.getUser(id).orElse(null);
    }

    // POST /users
    @PostMapping
    public User addUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    // DELETE /users/{id}
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted with ID: " + id;
    }
}
