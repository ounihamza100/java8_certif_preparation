package interfaces;

/**
 * @author Hamza Ouni
 */
public interface Vehicle {


    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }


    //static method in jva 8
    //Defining a static method within an interface is identical to defining one in a class.
    // Moreover, a static method can be invoked within other static and default methods.
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }

    static void test_static(){
        //impl...
        getHorsePower(10,5);

    }

    default void int21(){
        test_static();
    }

}
