package ee.politsei.portal.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * Social security number
     */
    @Column(unique = true)
    private String ssn;

    @Column(unique = true)
    private String firstname;

    @Column(unique = true)
    private String lastname;

    public Person(String ssn, String firstname, String lastname) {
        this.ssn = ssn;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person() {
    }


}



