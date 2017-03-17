package structural.facade;

/**
 *
 * Created by Andrey_Bindyuk on 3/14/2017.
 */
public class FacadeOperationsImpl implements FacadeOperations {
    PersonOperations personOperations = new PersonOperationsImpl();


    public void writePerson(Person person){
        personOperations.writePerson(person);
    }

    public Person whoIsSmarter(Person person, Person person1) {
        if (person.getIq() > person1.getIq()) {
            return person;
        } else if (person.getIq() < person1.getIq()) {
            return person1;
        }
        return null;
    }

    public boolean changePersonsIq(Person person, Person person1) {
        int temp = person.getIq();
        int temp1 = person1.getIq();
        person.setIq(temp1);
        person1.setIq(temp);
        personOperations.writePerson(person);
        personOperations.writePerson(person1);
        return true;
    }

    public boolean incrementIq(Person person) {
        person.setIq(person.getIq() + 1);
        personOperations.writePerson(person);
        return true;
    }

    public boolean decrementIq(Person person) {
        person.setIq(person.getIq() - 1);
        personOperations.writePerson(person);
        return true;
    }
}
