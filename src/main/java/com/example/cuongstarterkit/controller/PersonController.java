package com.example.cuongstarterkit.controller;

import com.example.cuongstarterkit.model.Person;
import com.example.cuongstarterkit.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/v1/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    @PostMapping
    @ResponseBody
    public ResponseEntity<Person> addNewPerson() {
        Person cuong = new Person();
        cuong.setName("Cuong");
        Person saved = personRepository.save(cuong);
        return ResponseEntity.ok(saved);
    }
}
