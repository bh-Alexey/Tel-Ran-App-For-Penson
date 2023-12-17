package us.telran.appforpenson.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import us.telran.appforpenson.entity.Person;
import us.telran.appforpenson.service.PersonService;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping(value = "/person/{id}")
    public Person getPersonById(@PathVariable(value = "id") Integer id) {
        return personService.getById(id);
    }

    @PostMapping(value = "/car")
    public void savePerson(@RequestBody Person person) {
        personService.save(person);
    }

    @DeleteMapping(value = "/car/{id}")
    public void deleteById(@PathVariable(value = "id") Integer id) {
        personService.deleteById(id);
    }

    @PutMapping(value = "/car/{id}")
    public void updateCarById(@PathVariable(value = "id") Integer id, @RequestBody Person person) {
        personService.update(id, person);
    }
}
