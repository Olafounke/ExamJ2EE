package ruth.baiou.AlbumProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity // Indique que cette classe sera une table en base de données
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Clé unique pour chaque album
    
    private String title; // Titre de l'album
    private String artist; // Artiste
    private String genre; // Genre musical
    private LocalDate releaseDate; // Date de sortie
    private String status; // Statut de disponibilité ("disponible" ou "emprunter")

}
