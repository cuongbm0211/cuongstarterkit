package com.example.cuongstarterkit.application.api.controller;

import com.example.cuongstarterkit.db.jpa.entities.Person;
import com.example.cuongstarterkit.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<Person> addNewPerson() {
//        Person cuong = new Person();
//        cuong.setName("Cuong");
//        Person saved = personRepository.save(cuong);
//        saved = personService.create();
        return ResponseEntity.ok(personService.create());
    }
}
