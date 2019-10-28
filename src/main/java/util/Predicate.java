package util;

/**
 * @author Hamza Ouni
 */
@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

    default Predicate<T> negate() {
        return t -> !test(t);
    }

    default Predicate<T> and(Predicate<T> p2) {

        return t -> this.test(t) && p2.test(t);
    }

    default Predicate<T> xOr(Predicate<T> after) {
        return t -> test(t) ^ after.test(t);// ^ == xOr
    }
}
