package com.uptake.people.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("person")
public class PersonController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getAll() {
        return new ResponseEntity<>("oh booger, i better return some people...", HttpStatus.OK);
    }

}
