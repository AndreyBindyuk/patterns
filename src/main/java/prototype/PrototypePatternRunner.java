package prototype;

import java.util.List;

/**
 * Created by Andrey_Bindyuk on 3/10/2017.
 */
public class PrototypePatternRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.loadData();

        Person person1 = (Person) person.clone();
        Person person2 = (Person) person.clone();
        List list = person1.getStringList();
        list.add("SystemEngineer");
        List list1 = person2.getStringList();
        list1.remove("Developer");
        System.out.println("person list" + person.getStringList());
        System.out.println("list" + list);
        System.out.println("list1" + list1);
    }
}
