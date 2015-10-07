package com.uptake.people.controller;

import org.junit.Test;
import org.springframework.http.HttpStatus;

public class PersonControllerTest {

    @Test
    public void getAllReturnsOK() throws Exception {

        PersonController controller = new PersonController();

        HttpStatus status = controller.getAll().getStatusCode();

        assert status == HttpStatus.OK;
    }

}