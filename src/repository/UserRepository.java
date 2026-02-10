package repository;

import model.User;           // ⚠️ Obligatoire
import java.util.List;        // ⚠️ Obligatoire
import java.util.Optional;    // ⚠️ Obligatoire
public interface UserRepository {

    /**
     * 
     * La classe UserRepository est une interface qui définit les opérations de base pour la gestion des utilisateurs dans l'application.
     * Elle contient des méthodes pour enregistrer, trouver, lister et supprimer des utilisateurs.
     * Author: SIMO LUCRECE
     * Date: FEVRIER 2025
     */
    /**Methode pour sauvegarder un utilisateur */
    void save(User user);

    /**Methode pour trouver un utilisateur par son ID
     * optional  est utilisé ici pour gérer les cas où l'utilisateur n'est pas trouvé
     */
    Optional<User> findById(Long id);

    /**Methode pour lister tous les utilisateurs */
    List<User> findAll();

    /**Methode pour supprimer un utilisateur par son ID */
    void delete(Long id);
    // User findById(Long id);
    // List<User> findAll();
    
}