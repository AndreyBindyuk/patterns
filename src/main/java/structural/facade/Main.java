package structural.facade;

/**
 *
 * Created by Andrey_Bindyuk on 3/14/2017.
 */
public class Main {
    public static void main(String[] args) {
        FacadeOperations facadeOperations = new FacadeOperationsImpl();
        Person person = new Person("Andrey",25,100);
        Person person1 = new Person("Sergey",30,99);

        facadeOperations.writePerson(person);
        facadeOperations.writePerson(person1);
        System.out.println("who is smarter: "+facadeOperations.whoIsSmarter(person, person1));
        facadeOperations.changePersonsIq(person,person1);
        facadeOperations.incrementIq(person);
        facadeOperations.decrementIq(person1);

    }
}
