
fait par SIMO NUEFELIE ANGE LUCRECE etudiante IDA 
#  Application de Gestion des Utilisateurs

##  Description

Ce projet présente deux versions d'une application de gestion des utilisateurs :

-  Version 1 : Application Java Console utilisant une architecture MVC.
  Cette version utilise une liste en mémoire (ArrayList) pour stocker les utilisateurs.
-  Version 2 : Application Spring Boot avec API REST et base de données MySQL.Cette version utilise : Spring Data JPA Hibernate Base de données MySQL.Les données sont persistées en base.

L'application permet d'effectuer les opérations CRUD :
- Créer un utilisateur
- Lire un utilisateur
- Lister tous les utilisateurs
- Supprimer un utilisateur

##  Technologies utilisées

- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL
- Maven
- Postman (tests API)

#  Installation et Exécution

## Prérequis

- Java 17 installé
- Maven installé
- MySQL installé et démarré

##Configuration Base de Données
Créer la base :
CREATE DATABASE user_management;
#   Exécution

#   version 1 avec Map 
Pour compiler ce projet acceder tout d'abord au repertoire qui contient votre projet dans votre terminal via la commande cd nomDeVotreRepertoire 
Pour compile entierement le projet taper la commande javac src\model\*.java src\repository\*.java src\service\*.java src\controller\*.java Main.java

#   version 2 avec mysql 
pour la version 2 celle avec java spring boot Exécution
Se placer dans le dossier du projet : 
executer la commande mvn spring-boot:run Ou exécuter : GestionUtilisateurApplication.java

URL de Base
http://localhost:8080/users

Tests (Postman)
*Ajouter un utilisateur POST http://localhost:8080/users
Body JSON :

{
  "name": "Alice",
  "email": "alice@gmail.com"
}
 Voir tous les utilisateurs GET http://localhost:8080/users

Voir les utilisateurs par ID GET http://localhost:8080/users/1
Modifier un utilisateur PUT http://localhost:8080/users/1
Supprimer un utilisateur DELETE http://localhost:8080/users/1
