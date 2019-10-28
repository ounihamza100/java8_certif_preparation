
import util.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Hamza Ouni
 */
public class PlayWithPredicate {

    public static void main(String[] args) {

        Predicate<String> p = String::isEmpty;
        Predicate<String> pNot = p.negate();



        System.out.println("For Hello = " + pNot.test("Hello"));
        System.out.println("For empty string = " + pNot.test(""));


        // a predicate that is true if a string is non null and non empty
        Predicate<String> p1 = s -> s != null;
        Predicate<String> p2 = s -> s.isEmpty();

        Predicate<String> p3 = p1.and(p2);

        assertThat(p3.test("")).isFalse();
        assertThat(p3.test(null)).isFalse();
        assertThat(p3.test("Not Empty!")).isFalse();


    }
}
