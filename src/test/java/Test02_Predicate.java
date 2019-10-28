import org.junit.Test;
import util.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Hamza Ouni
 */
public class Test02_Predicate {

    @Test
    public void predicate() {
        Predicate<String> p1 = s -> s.length() == 4;
        Predicate<String> p2 = s -> s.startsWith("J");

        Predicate<String> p3 =  p1.xOr(p2);// TODO

        assertThat(p3.test("True")).isTrue();
        assertThat(p3.test("Julia")).isTrue();
        assertThat(p3.test("Java")).isFalse();
    }
}
