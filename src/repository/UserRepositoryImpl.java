package repository;

import model.User;
import java.util.*;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Importer tes classes locales
// Comme il n'y a pas de package, Java les trouve automatiquement
// donc pas besoin d'import pour User et UserRepository


public class UserRepositoryImpl implements UserRepository {
    /**
     * La classe UserRepositoryImpl est une implémentation concrète de l'interface UserRepository. 
     * Elle utilise une liste en mémoire pour stocker les utilisateurs et fournit des méthodes pour gérer ces utilisateurs.
     * Author: SIMO LUCRECE
     * Date: FEVRIER 2025   
     * Cette classe permet de sauvegarder, trouver, lister et supprimer des utilisateurs dans une application simple.
     */

    /** Utilisation d'une Map pour stocker les utilisateurs en mémoire, avec l'ID comme clé */ 
    private Map<Long, User> users = new HashMap<>();
    

    /**Un compteur d'ID pour générer des identifiants uniques pour les utilisateurs */
    private Long idCounter = 1L;

    /**implémentation des méthodes de l'interface UserRepository */

    /**Méthode pour sauvegarder un utilisateur */
    @Override
    public void save(User user) {
        if (user.getId() == null) {
            user.setId(idCounter++);
        }
        users.put(user.getId(), user);
    }

    /**Méthode pour supprimer un utilisateur par son ID */
    @Override
    public void delete(Long id) {
        users.remove(id);
        System.out.println("User deleted with ID: " + id);
    }


    /**Méthode pour trouver un utilisateur par son ID */
    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    /**Méthode pour lister tous les utilisateurs */
    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}

