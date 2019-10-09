package interfaces;

/**
 * @author Hamza Ouni
 */
public class MyClass extends MyAbstractClass{
    @Override
    protected void protectedMethod() {
        // implement protected method here, without exposing it as public
        System.out.println("Impl of protected method");
    }


    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.foo();
    }

    @Override
    public void publicMethod_2() {

    }

    @Override
    public void bar() {

    }
}
