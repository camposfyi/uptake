package com.uptake.people.controller;

import com.uptake.people.controller.dto.PersonDto;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PersonControllerTest {

    @Test
    public void getAllReturnsOK() throws Exception {

        PersonController controller = new PersonController();

        HttpStatus status = controller.getAll().getStatusCode();

        assert status == HttpStatus.OK;
    }

    @Test
    public void getReturnsListOfAllPeople() throws Exception {
        PersonController controller = new PersonController();

        ResponseEntity<List<PersonDto>> status = controller.getAll();
        assert status.getBody().size() > 0;
    }

}