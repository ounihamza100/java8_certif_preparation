package interfaces;

/**
 *
 * each method within interface is implicitly {public abstract}
 * default methods are implicitly public, and provide an implementation.
 *
 * The reason why default methods were included in the Java 8 release is pretty obvious.
 * In a typical design based on abstractions, where an interface has one or multiple implementations,
 * if one or more methods are added to the interface, all the implementations will be forced to implement them too.
 * Otherwise, the design will just break down.Default interface methods are an efficient way to deal with this issue.
 * They allow us to add new methods to an interface that are automatically available in the implementations.
 * Thus, there's no need to modify the implementing classes.
 * In this way, backward compatibility is neatly preserved without having to refactor the implementers.
 * @author Hamza Ouni
 */
public interface Foo {

    //each field within interface is declared with  :  public static final keywords
    public static final int a = 2;

    public abstract void publicMethod_1();

    public  void publicMethod_2();

    default void foo() {
        System.out.println("Default implementation of foo()");
         publicMethod_1();
    }
    default void bar() {
        System.out.println("Itf -> bar() [default]");
    }
    public default void baz() {
        System.out.println("Itf -> baz() [default]");
    }



}
