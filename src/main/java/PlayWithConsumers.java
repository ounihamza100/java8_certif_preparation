import util.Consumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hamza Ouni
 */
public class PlayWithConsumers {

    public static void main(String[] args) {

        Consumer<List<String>> c1 = list -> list.add("one");

        Consumer<List<String>> c2 = list -> list.add("two");

        Consumer<List<String>> c3 = c1.andThen(c2);

        List<String> list = new ArrayList<>();
        list.add("three");

        c3.accept(list);
        System.out.println("list = " + list);
    }
}
