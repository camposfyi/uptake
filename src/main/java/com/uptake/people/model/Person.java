package com.uptake.people.model;

import java.util.UUID;

/*
    What defines a person? A person can have a lot of attributes, but
    let's not over-engineer the world, why build a spaceship when you only need
    a skateboard. We can enhance when the need arises
 */
public class Person {

    private UUID id;
    private String firstName;
    private String lastName;

    public Person(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
