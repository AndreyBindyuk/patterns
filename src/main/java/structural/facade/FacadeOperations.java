package structural.facade;

/**
 *
 * Created by Andrey_Bindyuk on 3/14/2017.
 */
public interface FacadeOperations {
    Person whoIsSmarter(Person person, Person person1);
    boolean changePersonsIq(Person iq, Person iq1);
    boolean incrementIq(Person person);
    boolean decrementIq(Person person);
    void writePerson(Person person);
}
