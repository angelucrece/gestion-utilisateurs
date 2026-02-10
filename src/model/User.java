package model;

public class User {
    /**
     * La classe User représente un utilisateur dans le système. 
     * Elle contient les informations de base sur l'utilisateur, 
     * telles que son ID, son nom et son adresse e-mail. 
     * Cette classe est utilisée pour stocker et manipuler les données des utilisateurs dans l'application.
     * Author: SIMO LUCRECE
     * Date: FEVRIER 2025
     */

    /** Declaration des attributs de l'utilisateur */
    private Long id;
    private String name;
    private String email;

    /** Constructeur*/ 
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    // Getters et Setters

    /** Methode getters pour l'affichage du nom de l'utiisateur */
    public String getName() {
        return name;
    }
    
    /** Methode setters pour la modification du nom de l'utilisateur */
    public void setName(String name) {
        this.name = name;
    }

    /** Methode getters pour l'affichage de l'email de l'utilisateur */
    public String getEmail() {
        return email;
    }
    
    /** Methode setters pour la modification de l'email de l'utilisateur */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Methode getters pour l'affichage de l'id de l'utilisateur */
    public Long getId() {
        return id;
    }
    
    /** Methode setters pour la modification de l'id de l'utilisateur */
    public void setId(Long id) {
        this.id = id;
    }

    /**Méthode toString pour afficher les informations de l'utilisateur */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Print "Hello, World!" to the console
        System.out.println("Hello, World!");
    }
}