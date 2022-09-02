package com.example.databasetest001.repositories;

import com.example.databasetest001.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface
CustomerRepository extends CrudRepository<Customer, Long> {

}
