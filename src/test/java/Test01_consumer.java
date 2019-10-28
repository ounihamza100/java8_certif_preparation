

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import static org.assertj.core.api.Assertions.assertThat;



/**
 * @author Hamza Ouni
 */
public class Test01_consumer {


    @Test
    public void consumer_1() {
        Consumer<List<String>> consumer = strings -> strings.clear();

        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));

        consumer.accept(list);

        assertThat(list).isEmpty();


    }



    @Test
    public void consumer_2() {
        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        Consumer<List<String>> consumer  = c1.andThen(c2);

        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));

        consumer.accept(list);
        assertThat(list).containsExactly("a","b","c","first","second");



     }









    @Test
    public void sh(){
        String text = "BBBBBGGGGGCCCCCCCCCCC";
        List<String> strings = new ArrayList<String>();
        int index = 0;
        while (index < text.length()) {
            strings.add(text.substring(index, Math.min(index + 4,text.length())));
            index += 4;
        }
        for(String item : strings) {
            System.out.println(item);
        }
    }

}
