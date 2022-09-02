package com.example.databasetest001.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long reservationId;
    String reservationName;
    @ManyToMany(mappedBy ="reservations")
    List<Customer> costumersOfThisReservation = new ArrayList<>();

    public Reservation(){}

    public Reservation(String reservationName, ArrayList costumersOfThisReservation){

        this.reservationName = reservationName;
        this.costumersOfThisReservation = costumersOfThisReservation;
    }

    public Reservation(String reservationName){
        this.reservationName = reservationName;
    }

}
