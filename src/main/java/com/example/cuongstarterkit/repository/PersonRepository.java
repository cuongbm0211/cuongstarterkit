package com.example.cuongstarterkit.repository;

import com.example.cuongstarterkit.model.Person;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, UUID> {

}
