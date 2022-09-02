package com.example.databasetest001.repositories;

import com.example.databasetest001.models.Spaceship;
import org.springframework.data.repository.CrudRepository;

public interface SpaceshipRepository  extends CrudRepository<Spaceship, Long> {
}
