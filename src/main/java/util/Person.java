package util;

/**
 * @author Hamza Ouni
 */
public class Person {

    private String lastName;

    private String firstName;
    private int age ;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
