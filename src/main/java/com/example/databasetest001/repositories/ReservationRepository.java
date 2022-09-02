package com.example.databasetest001.repositories;

import com.example.databasetest001.models.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
