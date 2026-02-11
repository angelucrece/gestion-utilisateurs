package model;


 /**
     * La classe User représente un utilisateur dans le système. 
     * Elle contient les informations de base sur l'utilisateur, 
     * telles que son ID, son nom et son adresse e-mail. 
     * Cette classe est utilisée pour stocker et manipuler les données des utilisateurs dans l'application.
     
     */
public class User {

    /** Declaration des attributs de l'utilisateur */
    private Long id;
    private String name;
    private String email;

    /**
 * Constructeur de la classe User.
 *
 * @param id Identifiant unique de l'utilisateur
 * @param name Nom complet de l'utilisateur
 * @param email Email de l'utilisateur
 */
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    // Getters et Setters

    /** Methode getters qui récupère le nom de l'utilisateur.
     * 
     * @return Le nom complet de l'utilisateur
    */
    public String getName() {
        return name;
    }
    
    /** Methode setters pour la modification du nom de l'utilisateur
    * @param name Nouveau nom de l'utilisateur
     */
    public void setName(String name) {
        this.name = name;
    }

    /** Methode getters qui récupère l'email de l'utilisateur.
     * 
     * @return L'email de l'utilisateur
    
     */
    public String getEmail() {
        return email;
    }
    
    /** Methode setters pour la modification de l'email de l'utilisateur
     * @param email Nouvel email de l'utilisateur
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Methode getters qui récupère l'id de l'utilisateur.
     * 
     * @return L'id de l'utilisateur
     */
    public Long getId() {
        return id;
    }
    
    /** Methode setters pour la modification de l'id de l'utilisateur 
     *  @param id Nouvel id de l'utilisateur
    */
    public void setId(Long id) {
        this.id = id;
    }

    /**Méthode toString pour afficher les informations de l'utilisateur
     * @return id ,nom et email de l'utilisateur
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    
}