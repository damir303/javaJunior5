package Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");
        list.add(person1);
        list.add(person2);
        list.remove(person2);

       System.out.println(list);

    }
}
