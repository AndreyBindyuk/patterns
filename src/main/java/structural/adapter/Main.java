package structural.adapter;

import structural.adapter.Adapter;
import structural.adapter.AdapterImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey_Bindyuk on 3/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        Adapter adapter = new AdapterImpl(list);
        adapter.push("4");
        System.out.println(list);
        adapter.pop();
        System.out.println(list);

    }
}
