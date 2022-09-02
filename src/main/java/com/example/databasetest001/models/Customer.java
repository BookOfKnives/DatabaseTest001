package com.example.databasetest001.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Costumer_Table") //Denne tablename bliver brugt i sql-databasen.
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long costumerId;
    @Column(name = "Costumer_Name")
    private String firstName;
    private String lastName;
    @JsonBackReference
    @ManyToMany(cascade = {
            CascadeType.MERGE
    })
    @JoinTable(name ="Costumers_and_reservations", //o this makes a NEW TABLE
    joinColumns = @JoinColumn(name = "Costumer_id", referencedColumnName="costumerId"),
    inverseJoinColumns = @JoinColumn(name = "reservation_id", referencedColumnName = "reservationId")
    )
    private List<Reservation> reservations = new ArrayList<>();

    public Customer(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
    }

}
