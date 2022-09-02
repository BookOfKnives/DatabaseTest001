package com.example.databasetest001.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long planetId;
    String planetName;

    public Planet() {
    }

    public Planet(String name) {
        this.planetName = name;
    }
}
