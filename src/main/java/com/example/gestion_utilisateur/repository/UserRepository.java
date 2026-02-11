package com.example.gestion_utilisateur.repository;


import com.example.gestion_utilisateur.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pour l'entité User.
 * <p>
 * Permet d'effectuer des opérations CRUD sur la table users dans MySQL.
 * Spring Data JPA génère automatiquement les méthodes.
 * </p>
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Pas besoin de coder les méthodes CRUD, JpaRepository s'en charge
}

