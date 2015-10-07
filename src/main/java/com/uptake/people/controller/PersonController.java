package com.uptake.people.controller;

import com.uptake.people.controller.dto.PersonDto;
import com.uptake.people.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
@RequestMapping("person")
public class PersonController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<PersonDto>> getAll() {

        List<Person> people = getSomePeople();

        return new ResponseEntity<>(transform(people), HttpStatus.OK);
    }

    private List<PersonDto> transform(List<Person> people) {
        return people.stream()
                .map(person -> new PersonDto(person.getId().toString(), person.getFirstName(), person.getLastName()))
                .collect(Collectors.toList());
    }

    private List<Person> getSomePeople() {
        return new ArrayList<Person>() {{
            add(new Person(UUID.randomUUID(), "Elvis", "Presley"));
            add(new Person(UUID.randomUUID(), "Michael", "Jackson"));
        }};
    }

}
