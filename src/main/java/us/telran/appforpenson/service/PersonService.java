package us.telran.appforpenson.service;

import us.telran.appforpenson.entity.Person;

public interface PersonService {

    Person getById(Integer id);

    void save(Person person);

    void deleteById(Integer id);

    void update(Integer id, Person person);
}
