package com.kaku.elasticsearchplayground.controller;

import com.kaku.elasticsearchplayground.document.Person;
import com.kaku.elasticsearchplayground.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/person")
public class PersonController {
    private final PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable final String id) {
        return service.findById(id);
    }

    @PostMapping
    public void save(@RequestBody final Person person) {
        service.save(person);
    }

}
