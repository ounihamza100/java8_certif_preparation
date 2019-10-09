package interfaces;

/**
 * @author Hamza Ouni
 */
public interface Foo {

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
