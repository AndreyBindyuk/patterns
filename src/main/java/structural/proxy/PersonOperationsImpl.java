package structural.proxy;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by Andrey_Bindyuk on 3/10/2017.
 */
public class PersonOperationsImpl implements PersonOperations {
    private static final String personsData = "personsData.properties";
    private List list;
    private String name;


    PersonOperationsImpl(String name) {
        this.name = name;
        readPerson(name);
    }

    public List readPerson(String name) {
        String getSpecificPerson;
        list = new ArrayList();
        Properties props = new Properties();
        try {
            String text = getResourceContent();
            InputStream input = new FileInputStream(personsData);
            props.load(input);
            if (text.contains(name)) {
                getSpecificPerson = props.getProperty(name);
                list.add(getSpecificPerson);
                System.out.println("Loading: " + list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + list);
    }


    private String getResourceContent() throws IOException {
        return new String(Files.readAllBytes(Paths.get(personsData)), StandardCharsets.UTF_8);
    }
}
