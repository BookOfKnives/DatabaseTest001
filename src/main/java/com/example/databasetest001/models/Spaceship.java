package com.example.databasetest001.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Spaceship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long spaceshipId;
    String spaceshipName;

    public Spaceship(){
    }

    public Spaceship(long spaceshipId, String spaceshipName){
        this.spaceshipId = spaceshipId;
        this.spaceshipName = spaceshipName;
    }
}
