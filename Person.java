import java.util.ArrayList;
import java.util.List;

public class Person implements Nameable {
    int id;
    String name;
    int age;
    boolean parent_permission;


    public Person(String name, int age, boolean parent_permission) {
        this.id = (int) (Math.random() * 1000000);
        this.name = name;
        this.age = age;
        this.parent_permission = parent_permission;
    }

    public String getCorrectName() {

        if (name.length() > 10) {
            return name.substring(0, 10).toUpperCase();
        } else {
            return name.toUpperCase();
        }
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;

        public String getName () {
            return name;
        }
        public int getAge () {
            return age;
        }
    }
}