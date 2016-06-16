package ee.politsei.portal.service;

import ee.politsei.portal.dao.PersonRepository;
import ee.politsei.portal.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void insertPerson(Person person) {
        personRepository.save(person);
    }

    public Person getPersonBySsn(String ssn) {
        return personRepository.findBySsn(ssn);
    }
}
