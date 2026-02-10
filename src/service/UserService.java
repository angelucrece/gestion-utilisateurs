package service;

import model.User;
import java.util.List;

public interface UserService {
    /**
     * La classe UserService est une interface qui définit les opérations de base pour la gestion des utilisateurs dans l'application.
     * Elle contient des méthodes pour enregistrer, trouver, lister et supprimer des utilisateurs.
     * Son rôle est de fournir une couche de service entre le contrôleur et le référentiel, permettant de gérer la logique métier liée aux utilisateurs.
     * Author: SIMO LUCRECE
     * Date: FEVRIER 2025
     */
    void addUser(User user);
    User getUser(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}