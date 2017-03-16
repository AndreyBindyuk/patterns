package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey_Bindyuk on 3/15/2017.
 */
public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory("dir");
        Directory dir1 = new Directory("dir1");
        FSEntity file = new File("file1.txt", 200);
        FSEntity file1 = new File("file2.txt", 300);
        dir1.add(file);
        dir.add(dir1);
        dir.add(file1);
        dir.print();
    }
}
