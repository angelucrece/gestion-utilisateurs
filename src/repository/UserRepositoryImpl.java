package repository;

import model.User;


import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;


/**
     * La classe UserRepositoryImpl est une implémentation concrète de l'interface UserRepository. 
     * Elle utilise une liste en mémoire pour stocker les utilisateurs et fournit des méthodes pour gérer ces utilisateurs.   
     * Cette classe permet de sauvegarder, trouver, lister et supprimer des utilisateurs dans une application simple.
     */

public class UserRepositoryImpl implements UserRepository {


    /** Utilisation d'une Map pour stocker les utilisateurs en mémoire, avec l'ID comme clé 
     * Cette structure de données permet un accès rapide aux utilisateurs par leur ID, ce qui est essentiel pour les opérations de recherche et de suppression. 
     * L'utilisation d'une Map facilite également la gestion des utilisateurs, car elle permet de stocker les utilisateurs de manière structurée et d'assurer l'unicité des ID.
      * La clé de la Map est de type Long, représentant l'ID unique de chaque utilisateur, tandis que la valeur est de type User, représentant les données de l'utilisateur.
      * Cette approche est simple et efficace pour une application qui ne nécessite pas une base de données complexe, et elle permet de se concentrer sur la logique métier sans se soucier des détails de la persistance des données.
      * Cependant, il est important de noter que cette implémentation en mémoire n'est pas adaptée pour une application à grande échelle ou pour une utilisation en production, car les données ne seront pas persistées entre les redémarrages de l'application.
      * Pour une application plus robuste, il serait nécessaire d'utiliser une base de données pour stocker les utilisateurs de manière persistante.
     *  @param users La Map qui stocke les utilisateurs, où la clé est l'ID de l'utilisateur et la valeur est l'objet User correspondant 
     */ 
    private Map<Long, User> users = new HashMap<>();
    

    /**Un compteur d'ID pour générer des identifiants uniques pour les utilisateurs
     * Ce compteur est utilisé pour attribuer un ID unique à chaque utilisateur lorsqu'il est ajouté au système. 
     * Lorsqu'un nouvel utilisateur est ajouté sans ID, le compteur est incrémenté et l'ID généré est assigné à cet utilisateur. 
     * L'utilisation d'un compteur d'ID garantit que chaque utilisateur a un identifiant unique
     */
    private Long idCounter = 1L;

    /**implémentation des méthodes de l'interface UserRepository */

    /**Méthode pour sauvegarder un utilisateur
     * Cette méthode vérifie si l'utilisateur a déjà un ID. Si ce n'est pas le cas, elle génère un nouvel ID en utilisant le compteur d'ID et l'assigne à l'utilisateur. Ensuite, elle stocke l'utilisateur dans la Map en utilisant son ID comme clé. 
     * Si l'utilisateur a déjà un ID, la méthode met à jour l'entrée correspondantee dans la Map avec les nouvelles données de l'utilisateur.   
     * L'utilisation de cette méthode permet de gérer à la fois l'ajout de nouveaux utilisateurs et la mise à jour des utilisateurs existants de manière efficace, tout en assurant que chaque utilisateur a un identifiant unique dans le système.
      * @param user L'utilisateur à sauvegarder ou à mettre à jour
     */
    @Override
    public void save(User user) {
        if (user.getId() == null) {
            user.setId(idCounter++);
        }
        users.put(user.getId(), user);
    }

    /**Méthode pour supprimer un utilisateur par son ID 
     * Cette méthode supprime l'utilisateur de la Map en utilisant son ID comme clé. Si l'utilisateur avec l'ID spécifié existe, il sera supprimé du système. Si aucun utilisateur n'est trouvé avec cet ID, la méthode peut simplement ne rien faire ou éventuellement lancer une exception, selon l'implémentation.   
     * La suppression d'un utilisateur est une opération importante pour maintenir la base de données à jour et pour gérer les utilisateurs qui ne sont plus actifs ou qui ont demandé la suppression de leurs données.
     * @param id L'identifiant de l'utilisateur à supprimer
    */
    @Override
    public void delete(Long id) {
        users.remove(id);
        System.out.println("User deleted with ID: " + id);
    }


    /**Méthode pour trouver un utilisateur par son ID 
     * Cette méthode utilise l'ID de l'utilisateur pour rechercher dans la Map et retourner l'utilisateur correspondant. Si un utilisateur avec l'ID spécifié est trouvé, il est retourné encapsulé dans un Optional. Si aucun utilisateur n'est trouvé avec cet ID, un Optional vide est retourné. L'utilisation d'Optional permet de gérer de manière élégante les cas où l'utilisateur n'est pas trouvé, évitant ainsi les problèmes liés aux références nulles.
     * @param id L'identifiant de l'utilisateur à trouver
     * @return un Optional contenant l'utilisateur trouvé. L'utilisateur correspondant à l'ID spécifié, ou un Optional vide si aucun utilisateur n'est trouvé
     
    */
    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    /**Méthode pour lister tous les utilisateurs 
     * Cette méthode retourne une liste de tous les utilisateurs stockés dans la Map. Elle crée une nouvelle ArrayList à partir des valeurs de la Map, ce qui permet de retourner une liste de tous les utilisateurs dans le système. La liste retournée peut être vide si aucun utilisateur n'est trouvé, mais elle ne sera jamais null, ce qui facilite la gestion des cas où il n'y a pas d'utilisateurs.
     
    * @return Une liste de tous les utilisateurs dans le système
    */
    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}

