package abstractfactory;

/**
 * Created by Andrey_Bindyuk on 3/10/2017.
 */
public class AbstractFactory {
    public PersonFactory getPersonFactory(Departments departments) {
        switch (departments){
            case IT:
                return new ITFactory();
        }
        return null;
    }
}
