package com.demospringboot.api.rest;

import com.demospringboot.application.dto.PersonneDTO;
import com.demospringboot.application.manager.PersonneManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonneManager personneManager;

    public PersonController(PersonneManager personneManager) {
        this.personneManager = personneManager;
    }

    @GetMapping("/findAll")
    private List<PersonneDTO> findAllPerson(){
        return personneManager.findAll();
    }
}
