package com.example.databasetest001.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planettype {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long planetTypeId;
    String planetTypeName;

    public Planettype(){}

    public Planettype(long planetTypeId, String planetTypeName){
        this.planetTypeId = planetTypeId;
        this.planetTypeName = planetTypeName;

    }
}
