package com.demospringboot.application.manager;

import com.demospringboot.application.dto.PersonneDTO;

import java.util.List;

public interface PersonneManager {
    List<PersonneDTO> findAll();
}
