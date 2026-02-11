package repository;

import model.User;           
import java.util.List;        
import java.util.Optional;   

/**
     * 
     * La classe UserRepository est une interface qui définit les opérations de base pour la gestion des utilisateurs dans l'application.
     * Elle contient des méthodes pour enregistrer, trouver, lister et supprimer des utilisateurs.
     */
public interface UserRepository {

    /**Methode pour sauvegarder un utilisateur 
     * Cette méthode permet d'enregistrer un utilisateur dans le système. Si l'utilisateur n'a pas d'ID, un ID unique sera généré pour lui.
     * Si l'utilisateur a déjà un ID, il sera mis à jour dans le système.
     * @param user L'utilisateur à sauvegarder ou à mettre à jour
    */
    void save(User user);

    /**Methode pour trouver un utilisateur par son ID
     * @param id L'identifiant de l'utilisateur à trouver
     * @return un Optional contenant l'utilisateur trouvé. L'utilisateur correspondant à l'ID spécifié, ou un Optional vide si aucun utilisateur n'est trouvé
     * optional  est utilisé ici pour gérer les cas où l'utilisateur n'est pas trouvé
     */
    Optional<User> findById(Long id);

    /**Methode pour lister tous les utilisateurs
     * Cette méthode permet de récupérer tous les utilisateurs stockés dans le système, ce qui est utile pour afficher la liste des utilisateurs ou pour effectuer des opérations sur tous les utilisateurs.
     * La liste retournée peut être vide si aucun utilisateur n'est trouvé, mais elle ne sera jamais null, ce qui facilite la gestion des cas où il n'y a pas d'utilisateurs.
     * @return Une liste de tous les utilisateurs dans le système
     */
    List<User> findAll();

    /**Methode pour supprimer un utilisateur par son ID 
     * Cette méthode permet de supprimer un utilisateur du système en utilisant son identifiant unique.
     * Si l'utilisateur avec l'ID spécifié existe, il sera supprimé du système. Si aucun utilisateur n'est trouvé avec cet ID, la méthode peut simplement ne rien faire ou éventuellement lancer une exception, selon l'implémentation.
     * La suppression d'un utilisateur est une opération importante pour maintenir la base de données à jour et pour gérer les utilisateurs qui ne sont plus actifs ou qui ont demandé la suppression de leurs données.
     * @param id L'identifiant de l'utilisateur à supprimer
    */
    void delete(Long id);
    // User findById(Long id);
    // List<User> findAll();
    
}