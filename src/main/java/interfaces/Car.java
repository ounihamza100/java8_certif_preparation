package interfaces;

/**
 * @author Hamza Ouni
 */
public class Car implements Vehicle , Alarm{

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String speedUp() {
        return null;
    }

    @Override
    public String slowDown() {
        return null;
    }

    @Override
    public String turnAlarmOn() {
        // custom implementation
        //return ""; or
        //return Vehicle.super.turnAlarmOn(); or
        //return Alarm.super.turnAlarmOn(); or
        return Vehicle.super.turnAlarmOn() + " " + Alarm.super.turnAlarmOn();

    }

    @Override
    public String turnAlarmOff() {
        // custom implementation
        //return ""; or
        //return Vehicle.super.turnAlarmOff(); or
        //return Alarm.super.turnAlarmOn(); or
        return Vehicle.super.turnAlarmOff() + " " + Alarm.super.turnAlarmOff();
    }


    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
    }
}
