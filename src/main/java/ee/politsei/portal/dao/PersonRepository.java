package ee.politsei.portal.dao;


import ee.politsei.portal.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    Person findBySsn(String ssn);

}
