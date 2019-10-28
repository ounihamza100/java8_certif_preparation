import java.util.function.Function;

import util.Person;

/**
 * @author Hamza Ouni
 */
public class PlayWithComparator {

    public static void main(String[] args) {

        java.util.Comparator<Person> cmp = new java.util.Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int cmp = p1.getLastName().compareTo(p2.getLastName());
                if (cmp == 0) {
                    return p1.getFirstName().compareTo(p2.getFirstName());
                } else {
                    return cmp ;
                }
            }
        };
java.util.Comparator<Person> c  = java.util.Comparator.comparing(Person::getLastName)
                                         .thenComparing(Person::getFirstName);




        Person m = new Person("mich","j" ,51);
        Person r = new Person("rod","s" ,71);
        Person t = new Person("paul","m" ,81);
        Person z = new Person("mi","jagger" ,31);
        Person w = new Person("jermaine","jackson" ,61);

        Function<Person, String> getLastName = p -> p.getLastName();

        util.Comparator<Person> cmp2 = util.Comparator.comparing(getLastName);

        System.out.println("mich and rod : " + cmp2.compare(m,r));


    }







}
