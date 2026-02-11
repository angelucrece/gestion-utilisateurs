package service;

import model.User;
import repository.UserRepository;

import java.util.List;


 /**
     * La classe UserServiceImpl est une implémentation de l'interface UserService. 
     * Elle fournit des méthodes concrètes pour gérer les utilisateurs, telles que l'ajout, la récupération, la liste et la suppression des utilisateurs.
     * Cette classe utilise un UserRepository pour interagir avec les données des utilisateurs.
     */
public class UserServiceImpl implements UserService {
   
    /** */
    private UserRepository userRepository;
    /**Constructeur pour injecter le UserRepository dans le service
     * Ce constructeur permet d'injecter une instance de UserRepository dans le service, ce qui permet au service de gérer les données des utilisateurs en utilisant le référentiel. 
     * L'injection de dépendance via le constructeur est une pratique courante qui facilite la testabilité et la flexibilité du code, car elle permet de remplacer facilement le référentiel par une implémentation différente (par exemple, pour les tests unitaires) sans modifier le code du service.
     * @param userRepository Le référentiel de gestion des utilisateurs à utiliser dans ce service
     */
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }   
    /**implémentation des méthodes de l'interface UserService */

    /**
     * Méthode pour ajouter un utilisateur 
     * Cette méthode permet d'ajouter un nouvel utilisateur au système. Elle prend un objet User en paramètre et le transmet au référentiel pour être sauvegardé. 
     * Si l'utilisateur n'a pas d'ID, un ID unique sera généré pour lui. Si l'utilisateur a déjà un ID, il sera mis à jour dans le système. 
     * @param user L'utilisateur à ajouter ou mettre à jour
     */
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    /**
     * Méthode pour récupérer un utilisateur par son ID 
     * Cette méthode permet de récupérer un utilisateur du système en utilisant son identifiant unique. Si un utilisateur avec l'ID spécifié est trouvé, il est retourné. Si aucun utilisateur n'est trouvé avec cet ID, la méthode peut retourner null ou éventuellement lancer une exception, selon l'implémentation.
     * La récupération d'un utilisateur par son ID est une opération courante dans les applications de gestion des utilisateurs, car elle permet d'accéder aux détails d'un utilisateur spécifique en fonction de son identifiant unique.
     * @param id L'identifiant de l'utilisateur à récupérer
     * @return L'utilisateur correspondant à l'ID spécifié, ou null si aucun utilisateur n'est trouvé
     */
    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    /**
     * Méthode pour récupérer la liste de tous les utilisateurs 
     * Cette méthode permet de récupérer tous les utilisateurs stockés dans le système, ce qui est utile pour afficher la liste des utilisateurs ou pour effectuer des opérations sur tous les utilisateurs. La liste retournée peut être vide si aucun utilisateur n'est trouvé, mais elle ne sera jamais null, ce qui facilite la gestion des cas où il n'y a pas d'utilisateurs.
     * @return Une liste de tous les utilisateurs dans le système
     */
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Methode pour supprimer un utilisateur par son ID
     * Cette méthode permet de supprimer un utilisateur du système en utilisant son identifiant unique. Si l'utilisateur avec l'ID spécifié existe, il sera supprimé du système. Si aucun utilisateur n'est trouvé avec cet ID, la méthode peut simplement ne rien faire ou éventuellement lancer une exception, selon l'implémentation.
     * La suppression d'un utilisateur est une opération importante pour maintenir la base de données à jour    
     * et pour gérer les utilisateurs qui ne sont plus actifs ou qui ont demandé la suppression de leurs données. En utilisant l'ID de l'utilisateur, cette méthode assure que le bon utilisateur est supprimé du système.
     * @param id L'identifiant de l'utilisateur à supprimer
     * 
     */
    @Override
    public void deleteUser(Long id) {
        User user = getUser(id);
        if (user != null) {
            userRepository.delete(id);
        }
    }
}