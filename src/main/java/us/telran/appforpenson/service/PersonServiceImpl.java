package us.telran.appforpenson.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import us.telran.appforpenson.entity.Person;
import us.telran.appforpenson.repository.PersonRepository;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person getById(Integer id) {
        Optional<Person> optional = personRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public void save(Person person) {
        if (person == null) {
            return;
        }

        personRepository.save(person);
    }

    @Override
    public void deleteById(Integer id) {
        if (id == null) {
            return;
        }
        personRepository.deleteById(id);
    }

    @Override
    public void update(Integer id, Person person) {
        if (person == null) {
            return;
        }

        Optional<Person> persistPersonOptional = personRepository.findById(id);

        if (persistPersonOptional.isPresent()) {
            Person persistPerson = persistPersonOptional.get();
            persistPerson.setName(person.getName());
            persistPerson.setSurname(person.getSurname());
            persistPerson.setPassword(person.getPassword());
            persistPerson.setStatus(person.getStatus());
            personRepository.save(persistPerson);
        }
    }
}
