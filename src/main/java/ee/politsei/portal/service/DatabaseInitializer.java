package ee.politsei.portal.service;

import ee.politsei.portal.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseInitializer {

    @Autowired
    PersonService personService;

    public void populateDatabase() {

        personService.insertPerson(new Person("48306013742", "Pille", "Puusepp"));

    }

}
