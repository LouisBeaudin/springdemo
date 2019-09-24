package com.demospringboot.domain.dao;

import com.demospringboot.domain.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneDAO extends JpaRepository<Personne, Long> {
}
