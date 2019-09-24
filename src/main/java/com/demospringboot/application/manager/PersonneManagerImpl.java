package com.demospringboot.application.manager;

import com.demospringboot.application.dto.PersonneDTO;
import com.demospringboot.domain.OrikaBeanMapper;
import com.demospringboot.domain.dao.PersonneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneManagerImpl implements PersonneManager {

    private final PersonneDAO personneDAO;

    private final OrikaBeanMapper orikaBeanMapper;

    public PersonneManagerImpl(OrikaBeanMapper orikaBeanMapper, PersonneDAO personneDAO) {
        this.orikaBeanMapper = orikaBeanMapper;
        this.personneDAO = personneDAO;
    }

    public List<PersonneDTO> findAll() {
        return orikaBeanMapper.mapAsList(personneDAO.findAll(), PersonneDTO.class);
    }
}
