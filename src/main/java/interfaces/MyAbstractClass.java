package interfaces;

/**
 * @author Hamza Ouni
 */
public abstract class MyAbstractClass implements Foo{


    @Override
    public void publicMethod_1() {
        protectedMethod(); // you can call protected method here
        // do other stuff
    }

    protected abstract void protectedMethod();
}
