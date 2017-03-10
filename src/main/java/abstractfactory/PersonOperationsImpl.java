package abstractfactory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Andrey_Bindyuk on 3/10/2017.
 */
public class PersonOperationsImpl implements PersonOperations {
    private static final String personsData = "personsData.properties";

    @Override
    public boolean writePerson(Person person) {
        Properties props = new Properties();
        Boolean isUpdated = false;
        try {
            String text = getResourceContent();
            Writer output = new BufferedWriter(new FileWriter(personsData, true));
            if (!text.contains(person.getName())) {
                props.setProperty(person.getName(), person.toString());
                props.store(output, null);
                isUpdated = true;
            }

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public Map<String, String> readPerson() {
        Map stringPersonsMap = new HashMap();
        Properties props = new Properties();
        InputStream input;
        try {
            input = new FileInputStream(personsData);
            props.load(input);
            for (Map.Entry<Object, Object> map : props.entrySet()) {
                stringPersonsMap.put(map.getKey(), map.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringPersonsMap;
    }

    @Override
    public String readPerson(String name) {
        String getSpecificPerson = null;
        Properties props = new Properties();
        try {
            String text = getResourceContent();
            InputStream input = new FileInputStream(personsData);
            props.load(input);
            if (text.contains(name)) {
                getSpecificPerson = props.getProperty(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return getSpecificPerson;
    }


    private String getResourceContent() throws IOException {
        return new String(Files.readAllBytes(Paths.get(personsData)), StandardCharsets.UTF_8);
    }
}
