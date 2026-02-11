package controller;

import model.User;
import service.UserService;

import java.util.List;

/**
     * La classe UserController est un contrôleur qui gère les requêtes liées aux utilisateurs dans l'application. 
     * Elle utilise un UserService pour effectuer les opérations de gestion des utilisateurs, 
     * telles que l'ajout, la récupération, la liste et la suppression des utilisateurs.
     */
public class UserController {
    private UserService userService;

    /**Constructeur pour injecter le UserService dans le contrôleur 
     * @param userService Le service de gestion des utilisateurs à utiliser dans ce contrôleur
     *
    */
    public UserController(UserService userService) {
        this.userService = userService;
    }
    

    /**Méthode pour ajouter un utilisateur
     * @param user L'utilisateur à ajouter
     */
    public void addUser(User user) {
        userService.addUser(user);
        System.out.println("User added: " + user);
    } 

    /**Méthode pour récupérer un utilisateur par son ID 
     * @param id L'identifiant de l'utilisateur à récupérer
     * @return L'utilisateur correspondant à l'ID spécifié, ou null si aucun utilisateur n'est trouvé
    */
    public User getUser(Long id) {
        //  User user = userService.getUser(id);
        return userService.getUser(id);
        //  System.out.println("User retrieved: " + user);
    }
    
    /**Méthode pour récupérer la liste de tous les utilisateurs 
     * @return Une liste de tous les utilisateurs dans le système
    */
    public List<User> getAllUsers() {   
         List<User> users = userService.getAllUsers();
        System.out.println("All users: " + users);
        return users;
    }
    
    /**Méthode pour supprimer un utilisateur par son ID
     * @param id L'identifiant de l'utilisateur à supprimer
     */
    public void deleteUser(Long id) {
        userService.deleteUser(id);
        System.out.println("User deleted with ID: " + id);
    }
}