package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey_Bindyuk on 3/10/2017.
 */
public class Person implements Cloneable {
    private List<String> stringList;

    public Person() {
        stringList = new ArrayList<>();
    }

    public Person(List<String> stringList) {
        this.stringList = stringList;
    }

    public void loadData() {
        stringList.add("Developer");
        stringList.add("Tester");
        stringList.add("SupportEngineer");
    }

    public List<String> getStringList() {
        return stringList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List temp = new ArrayList<>();
        for(String s : this.getStringList()){
            temp.add(s);
        }
        return new Person(temp);
    }
}
