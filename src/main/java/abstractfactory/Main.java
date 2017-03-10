package abstractfactory;

/**
 * Created by Andrey_Bindyuk on 3/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        PersonOperations personOperations = new PersonOperationsImpl();
        AbstractFactory abstractFactory = new AbstractFactory();
        PersonFactory personFactory = abstractFactory.getPersonFactory(Departments.IT);
        Person person = personFactory.getPerson(Positions.DEVELOPER);
        if(personOperations.writePerson(person)){
            System.out.println("file has been updated succesfully");
        }
    }
}