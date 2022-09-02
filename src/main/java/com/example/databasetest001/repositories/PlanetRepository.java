package com.example.databasetest001.repositories;

import com.example.databasetest001.models.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
}
