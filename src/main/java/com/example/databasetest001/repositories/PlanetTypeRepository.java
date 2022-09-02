package com.example.databasetest001.repositories;

import com.example.databasetest001.models.Planettype;
import org.springframework.data.repository.CrudRepository;

public interface PlanetTypeRepository  extends CrudRepository<Planettype, Long> {
}
