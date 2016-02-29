import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by vbendor on 2/29/16.
 */
public class PersonComparator {
    public static void main(String[] args) {
        List<Person> personList = Person.createShortList();

        // Sort with Inner Class
        Collections.sort(personList, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getGivenName().compareTo(p2.getGivenName());
            }
        });

        System.out.println("=== Sorted Asc GivenName ===");

        for(Person p:personList){
            System.out.println(p.getGivenName());
        }

    }
}