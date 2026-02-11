package service;

import model.User;
import java.util.List;

 /**
     * La classe UserService est une interface qui définit les opérations de base pour la gestion des utilisateurs dans l'application.
     * Elle contient des méthodes pour enregistrer, trouver, lister et supprimer des utilisateurs.
     * Son rôle est de fournir une couche de service entre le contrôleur et le référentiel, permettant de gérer la logique métier liée aux utilisateurs.
     */
public interface UserService {
   /**
    * Méthode pour ajouter un utilisateur 
     * Cette méthode permet d'ajouter un nouvel utilisateur au système. Elle prend un objet User en paramètre et le transmet au référentiel pour être sauvegardé. 
     * Si l'utilisateur n'a pas d'ID, un ID unique sera généré pour lui. Si l'utilisateur a déjà un ID, il sera mis à jour dans le système. 
    * @param user L'utilisateur à ajouter ou mettre à jour
    */
    void addUser(User user);

    /**
     * Méthode pour récupérer un utilisateur par son ID 
     * Cette méthode permet de récupérer un utilisateur du système en utilisant son identifiant unique. Si un utilisateur avec l'ID spécifié est trouvé, il est retourné. Si aucun utilisateur n'est trouvé avec cet ID, la méthode peut retourner null ou éventuellement lancer une exception, selon l'implémentation.
     * La récupération d'un utilisateur par son ID est une opération courante dans les applications de      
     * @param id L'identifiant de l'utilisateur à récupérer
     * @return L'utilisateur correspondant à l'ID spécifié, ou null si aucun utilisateur n'est trouvé
     */
    User getUser(Long id);

    /**
     * Méthode pour récupérer la liste de tous les utilisateurs 
     * Cette méthode permet de récupérer tous les utilisateurs stockés dans le système, ce qui est utile pour afficher la liste des utilisateurs ou pour effectuer des opérations sur tous les utilisateurs. La liste retournée peut être vide si aucun utilisateur n'est trouvé, mais elle ne sera jamais null, ce qui facilite la gestion des cas où il n'y a pas d'utilisateurs.
     * @return Une liste de tous les utilisateurs dans le système
     */
    List<User> getAllUsers();

    /**
     *  Methode pour supprimer un utilisateur par son ID
     * Cette méthode permet de supprimer un utilisateur du système en utilisant son identifiant unique. Si
     * @param id l'identifiant de l'utilisateur
     */
    void deleteUser(Long id);
}