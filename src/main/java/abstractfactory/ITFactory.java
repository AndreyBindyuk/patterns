package abstractfactory;

/**
 * Created by Andrey_Bindyuk on 3/10/2017.
 */
public class ITFactory implements PersonFactory {
    @Override
    public Person getPerson(Positions position) {
        switch (position){
            case DEVELOPER:
                return new Developer();
        }
        return null;
    }
}
