package com.demospringboot.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "person")
public class Personne extends PersistableElement{

    @Column(name="name")
    private String name;

    @Column(name="lastname")
    private String lastName;

    public Personne(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
