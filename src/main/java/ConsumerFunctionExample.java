/**
 * @author Hamza Ouni
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerFunctionExample{
    public static void main(String args[]){


     Consumer<String> cons = System.out::println;

     cons.accept("hi");

    }


}
