package ee.politsei.portal.controller;

import ee.politsei.portal.model.Person;
import ee.politsei.portal.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/ssn/{ssn}")
    public Person bySsn(Model model, @PathVariable String ssn) {
        return personService.getPersonBySsn(ssn);
    }

}
