package interfaces;

/**
 *
 * Multiple Interface Inheritance Rules
 * @author Hamza Ouni
 */
public interface Alarm {

    default String turnAlarmOn() {
        return "Turning the alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the alarm off.";
    }
}
