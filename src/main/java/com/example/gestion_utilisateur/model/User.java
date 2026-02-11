package com.example.gestion_utilisateur.model;



// public class User {
//     private Long id;
//     private String name;
//     private String email;

//     public User() {
//     }

//     public User(Long id, String name, String email) {
//         this.id = id;
//         this.name = name;
//         this.email = email;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }
// }






// public class User {
//     private Long id;
//     private String name;
//     private String email;

//     public User() {
//     }

//     public User(Long id, String name, String email) {
//         this.id = id;
//         this.name = name;
//         this.email = email;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }
// }




import jakarta.persistence.*;

/**
 * Représente un utilisateur de l'application.
 * Contient les informations de base : id, nom et email.
 * Utilisé pour stocker les données dans la base MySQL.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    public User() { }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}
