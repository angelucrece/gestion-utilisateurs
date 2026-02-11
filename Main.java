/**
 * A simple Java program that prints "Hello, World!" to the console.
 * This is a basic example of a Java application, demonstrating the structure of a Java class and the main method.
 * Author: OpenAI's ChatGPT
 * Date: June 2024
 */
// public class Main {
//     /**
//      * The main method is the entry point of the Java application. It is where the program starts execution.
//      * @param args Command-line arguments passed to the program (not used in this example).
//      */
//     private Long id;
//     private String name;
//     private String email;

//     // Getters et Setters
//     public String getName() {
//         return name;
//     }
    
//     public void setName(String name) {
//         this.name = name;
//     }
//     public String getEmail() {
//         return email;
//     }
    
//     public void setEmail(String email) {
//         this.email = email;
//     }
//     public Long getId() {
//         return id;
//     }
    
//     public void setId(Long id) {
//         this.id = id;
//     }

//     // methode to string
//     @Override
//     public String toString() {
//         return "User{" +
//                 "id=" + id +
//                 ", name='" + name + '\'' +
//                 ", email='" + email + '\'' +
//                 '}';
//     }

//     // Main method to run the application
//     public static void main(String[] args) {
//         // Print "Hello, World!" to the console
//         System.out.println("Hello, World!");
//     }
// }




import controller.UserController;
import model.User;
import repository.UserRepositoryImpl;
import service.UserServiceImpl;
/**Classe principale main pour lancer l'application de gestion des utilisateurs */
public class Main {

    
   /** Méthode principale du programme.
    *
    * @param args arguments de la ligne de commande
    */
    
    public static void main(String[] args) {
        UserController userController = new UserController(new UserServiceImpl(new UserRepositoryImpl()));

        User user1 = new User(1L, "Alice", "alice@email.com");
        User user2 = new User(2L, "Bob", "bob@email.com");
         User user3 = new User(3L, "Charlie", "charlie@email.com");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);

        userController.getAllUsers();
        userController.getUser(1L);
        userController.deleteUser(1L);
        userController.getAllUsers();
    }
}

