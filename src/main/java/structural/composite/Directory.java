package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Andrey_Bindyuk on 3/15/2017.
 */
public class Directory implements FSEntity {
    private List<FSEntity> files;
    private String name;

    public Directory(String dirName) {
        this.name = dirName;
        this.files = new ArrayList<>();
    }

    public void add(FSEntity fsEntity) {
        files.add(fsEntity);
    }

    public void remove(FSEntity fsEntity) {

        files.remove(fsEntity);
    }

    public void print() {
        System.out.println("______");
        System.out.println("Name =" + getComponentName());
        System.out.println("size =" + getComponentSize());
        System.out.println("-------------");
        for (FSEntity fsEntity : files) {
            fsEntity.print();
        }
    }

    @Override
    public String getComponentName() {
        return name;
    }

    @Override
    public int getComponentSize() {
        int sizeOfAllFiles = 0;
        Iterator iterator = getFiles().iterator();
        while (iterator.hasNext()) {
            FSEntity fsEntity = (FSEntity) iterator.next();
            sizeOfAllFiles += fsEntity.getComponentSize();
        }
        return sizeOfAllFiles;
    }

    public List getFiles() {
        return files;
    }
}
