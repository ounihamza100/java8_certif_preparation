package util;


import java.util.Objects;
import java.util.function.Function; /**
 * @author Hamza Ouni
 */
@FunctionalInterface
public interface Comparator<T> {

    int compare(T t1, T t2);

    static <T, U extends Comparable<U>> Comparator<T> comparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (p1, p2) -> {
            U lastName1 = keyExtractor.apply(p1);
            U lastName2 = keyExtractor.apply(p2);
            return lastName1.compareTo(lastName2);
        };
    }
}
