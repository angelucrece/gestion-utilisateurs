package service;

import model.User;
import repository.UserRepository;

import java.util.List;
import java.util.Optional;


public class UserServiceImpl implements UserService {
    /**
     * La classe UserServiceImpl est une implémentation de l'interface UserService. 
     * Elle fournit des méthodes concrètes pour gérer les utilisateurs, telles que l'ajout, la récupération, la liste et la suppression des utilisateurs.
     * Cette classe utilise un UserRepository pour interagir avec les données des utilisateurs.
     * Author: SIMO LUCRECE
     * Date: FEVRIER 2025
     */
    private UserRepository userRepository;
    /**Constructeur pour injecter le UserRepository dans le service */
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }   
    /**implémentation des méthodes de l'interface UserService */
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        User user = getUser(id);
        if (user != null) {
            userRepository.delete(id);
        }
    }
}