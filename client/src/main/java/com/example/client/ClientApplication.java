package com.example.client;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initializeH2Database(ClientRepository clientRepository) {
        return args -> {
            // Initialisation optionnelle - commentée pour éviter les erreurs si la DB n'est pas prête
            // Les données peuvent être ajoutées via l'API REST une fois le service démarré
            /*
            Client client1 = new Client(null, "Amine SAFI", 23F);
            Client client2 = new Client(null, "Amal ALAOUI", 22F);
            Client client3 = new Client(null, "Samir RAMI", 22F);
            clientRepository.save(client1);
            clientRepository.save(client2);
            clientRepository.save(client3);
            */
        };
    }
}
