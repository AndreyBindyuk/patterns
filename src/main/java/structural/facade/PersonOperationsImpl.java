package structural.facade;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 *
 * Created by Andrey_Bindyuk on 3/14/2017.
 */
public class PersonOperationsImpl implements PersonOperations {
    private Map<String,Person> personsMap = new HashMap<>();

    @Override
    public boolean writePerson(Person person) {
        personsMap.put(person.getName(),person);
        return true;
    }

    @Override
    public Map<String, Person> readPerson() {
        return personsMap;
    }

    @Override
    public Person readPerson(String name) {
        return personsMap.get(name);
    }
}
