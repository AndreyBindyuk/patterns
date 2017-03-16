package structural.proxy;


/**
 *
 * Created by Andrey_Bindyuk on 3/14/2017.
 */
public class ProxyPersonOperationsImpl implements PersonOperations {
    private PersonOperationsImpl personOperations;
    private String name;

    public ProxyPersonOperationsImpl(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if (personOperations == null) {
            personOperations = new PersonOperationsImpl(name);
        } else
            personOperations.display();
    }
}
