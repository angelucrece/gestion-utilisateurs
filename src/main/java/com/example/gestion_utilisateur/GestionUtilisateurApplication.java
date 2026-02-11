package com.example.gestion_utilisateur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principale de l'application de gestion des utilisateurs.
 * <p>
 * Cette classe lance l'application Spring Boot et initialise le contexte.
 * </p>
 * @author Lucrèce
 * @version 1.0
 */

@SpringBootApplication
public class GestionUtilisateurApplication {


	/**
     * Point d'entrée de l'application Spring Boot.
     * 
     * @param args les arguments de la ligne de commande
     */

	public static void main(String[] args) {
		SpringApplication.run(GestionUtilisateurApplication.class, args);
	}

}
