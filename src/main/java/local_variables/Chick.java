package local_variables;

/**
 * @author Hamza Ouni
 */
public class Chick {
    {
        System.out.println("setting field");
        this.name = "";
    }

    private String name = "Fluffy";

    //instance initializer


    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }

    //setting field
    //setting constructor
    //Tiny
}
