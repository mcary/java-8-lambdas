import java.util.Arrays;
import java.util.List;

/**
 * Created by vbendor on 2/29/16.
 */
public class Person {
    public Person(String name, int age) {
        this.givenName = name;
        this.age = age;
    }

    public String getGivenName() {
        return givenName;
    }

    public int getAge() {
        return age;
    }

    private String givenName;
    private int age;

    public static List<Person> createShortList() {
        return Arrays.asList(new Person("Amy", 23), new Person("Jack", 30), new Person("Joe", 12));
    }
}
