package com.demospringboot.application.dto;

public class PersonneDTO {
    private String name;
    private String lastName;

    public PersonneDTO() {
    }

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
