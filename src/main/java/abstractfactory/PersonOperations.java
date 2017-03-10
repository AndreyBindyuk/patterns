package abstractfactory;

import java.util.Map;

/**
 * Created by Andrey_Bindyuk on 3/10/2017.
 */
public interface PersonOperations {
    boolean writePerson(Person person);

    Map<String, String> readPerson();

    String readPerson(String name);

}
