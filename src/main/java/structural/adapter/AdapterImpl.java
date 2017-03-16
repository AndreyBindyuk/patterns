package structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey_Bindyuk on 3/13/2017.
 */
public class AdapterImpl implements Adapter {
    List list;
    public AdapterImpl(List list) {
        this.list = list;
    }

    @Override
    public void pop() {
        list.remove(list.size()-1);
    }

    @Override
    public void push(Object s) {
        list.add(s);
    }
}
