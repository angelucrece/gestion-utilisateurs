package com.example.gestion_utilisateur.service;



import com.example.gestion_utilisateur.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Interface définissant les méthodes de gestion des utilisateurs.
 */
public interface UserService {
    User addUser(User user);
    Optional<User> getUser(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}

