package structural.facade;

import java.util.List;
import java.util.Map;

/**
 *
 * Created by Andrey_Bindyuk on 3/14/2017.
 */
public interface PersonOperations {
    boolean writePerson(Person person);

    Map<String, Person> readPerson();

    Person readPerson(String name);
}
