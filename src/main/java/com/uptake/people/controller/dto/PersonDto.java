package com.uptake.people.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDto {
    @JsonProperty
    private String id;
    @JsonProperty
    private String firstName;
    @JsonProperty
    private String lastName;

    public PersonDto(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
