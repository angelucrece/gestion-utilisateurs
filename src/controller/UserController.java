package controller;

import model.User;
import service.UserService;

import java.util.List;


public class UserController {
    /**
     * La classe UserController est un contrôleur qui gère les requêtes liées aux utilisateurs dans l'application. 
     * Elle utilise un UserService pour effectuer les opérations de gestion des utilisateurs, 
     * telles que l'ajout, la récupération, la liste et la suppression des utilisateurs.
     * Author: SIMO LUCRECE
     * Date: FEVRIER 2025
     */


    private UserService userService;

    /**Constructeur pour injecter le UserService dans le contrôleur */
    public UserController(UserService userService) {
        this.userService = userService;
    }
    

    /**Méthode pour ajouter un utilisateur */
    public void addUser(User user) {
        userService.addUser(user);
        System.out.println("User added: " + user);
    } 

    /**Méthode pour récupérer un utilisateur par son ID */
    public User getUser(Long id) {
         User user = userService.getUser(id);
        return userService.getUser(id);
        //  System.out.println("User retrieved: " + user);
    }
    
    /**Méthode pour récupérer la liste de tous les utilisateurs */
    public List<User> getAllUsers() {   
         List<User> users = userService.getAllUsers();
        System.out.println("All users: " + users);
        return users;
    }
    
    /**Méthode pour supprimer un utilisateur par son ID */
    public void deleteUser(Long id) {
        userService.deleteUser(id);
        System.out.println("User deleted with ID: " + id);
    }
}