package com.example.cuongstarterkit.services;

import com.example.cuongstarterkit.db.jpa.entities.Person;
import com.example.cuongstarterkit.db.jpa.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person create() {
        Person cuong = new Person();
        cuong.setName("Cuong");
        return personRepository.save(cuong);
    }
}
