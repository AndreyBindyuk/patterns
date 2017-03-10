package abstractfactory;

/**
 * Created by Andrey_Bindyuk on 3/9/2017.
 */
public class Person {
    private String name;
    private int age;
    private Departments department;
    private Positions position;

    public Person(String name, int age, Departments department, Positions position) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Departments getDepartment() {
        return department;
    }

    public Person setDepartment(Departments department) {
        this.department = department;
        return this;
    }

    public Positions getPosition() {
        return position;
    }

    public Person setPosition(Positions position) {
        this.position = position;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", position=" + position +
                '}';
    }
}
