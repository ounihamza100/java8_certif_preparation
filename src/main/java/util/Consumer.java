package util;

/**
 * @author Hamza Ouni
 */
@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);

    default Consumer<T> andThen(Consumer<T> other) {
        return (T t) -> {
            accept(t);
            other.accept(t);
        };
    }
}
