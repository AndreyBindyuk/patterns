package structural.proxy;

/**
 * Created by Andrey_Bindyuk on 3/14/2017.
 */
public class Main {
    public static void main(String[] args) {
        PersonOperations personOperations = new ProxyPersonOperationsImpl("Andrey");
        personOperations.display();
        System.out.println("________");
        personOperations.display();


    }
}
