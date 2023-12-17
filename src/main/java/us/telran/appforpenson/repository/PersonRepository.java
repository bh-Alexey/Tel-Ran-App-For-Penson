package us.telran.appforpenson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import us.telran.appforpenson.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
