package com.example.databasetest001;

import com.example.databasetest001.models.Customer;
import com.example.databasetest001.models.Planet;
import com.example.databasetest001.models.Reservation;
import com.example.databasetest001.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DatabaseTest001Application {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseTest001Application.class, args);
    }

    @Bean
    public CommandLineRunner importData(

            CustomerRepository customerRepository,
            PlanetRepository planetRepository,
            PlanetTypeRepository planetTypeRepository,
            ReservationRepository reservationRepository,
            SpaceshipRepository spaceshipRepository) {

        return (args) -> {

            /**
             *  Save a few customers
             */
            final List<Customer> customers = new ArrayList<>();
            customers.add(new Customer("Jack", "Bauer"));
            customers.add(new Customer("Chloe", "O'Brian"));
            customers.add(new Customer("Kim", "Bauer"));
            customers.add(new Customer("David", "Palmer"));
            customers.add(new Customer("Michelle", "Dessler"));
            customerRepository.saveAll(customers);

            final List<Planet> planets = new ArrayList<>();
            planets.add(new Planet("Mars"));
            planets.add(new Planet("Jupiter"));
            planetRepository.saveAll(planets);

            final List<Reservation> reservations = new ArrayList<>();
            reservations.add(new Reservation("MyFirstReservation"));
            reservationRepository.saveAll(reservations);
        };
    }
}
