package InitializerBlocks;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author Hamza Ouni
 */
public class InitializerBlocks {


    /**
     * <Strong>Order of Initialization :
     *  Fields and instance initializer blocks are run in the order in which they appear in the file.
     *  The constructor runs after all fields and instance initializer blocks have run.
     *
     *
     *
     */

    int a;
    {
        System.out.println(a);
    }

    private String name = "Fluffy";

    { System.out.println("setting field"); }

    public InitializerBlocks() {
        name = "Tiny";
        System.out.println("setting constructor");
    }


    {
        fullname = null;
        //System.out.println(fullname);
    }
    String fullname  ;

    {
       // System.out.println(number);
        number = 4; }

     private int number;




    void test() {
        //Declaration is the process of defining the variable
        int id;
        //Initialization, on the other hand, is all about assigning a value
        id = 1;
    }



    public static void main(String[] args) {

        InitializerBlocks chick = new InitializerBlocks();
        System.out.println(chick.name);
    }
}
