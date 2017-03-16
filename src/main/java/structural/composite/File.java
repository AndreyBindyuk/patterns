package structural.composite;

import java.util.List;

/**
 * Created by Andrey_Bindyuk on 3/15/2017.
 */
public class File implements FSEntity {
    private int size;
    private String name;

    public File(String fileName, int fileSize) {
        this.name = fileName;
        this.size = fileSize;
    }

    @Override
    public void print() {
        System.out.println("     -------------");
        System.out.println("     Name =" + getComponentName());
        System.out.println("     size =" + getComponentSize());
        System.out.println("     -------------");
    }

    @Override
    public String getComponentName() {
        return name;
    }

    @Override
    public int getComponentSize() {
        return size;
    }
}
