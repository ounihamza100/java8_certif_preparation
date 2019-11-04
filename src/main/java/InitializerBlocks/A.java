package InitializerBlocks;

/**
 * @author Hamza Ouni
 */
public class A {

    static int a;
    static int b = 5;


    static void x() {

    }
    public int getA() {

        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        A.b = b;
    }


    public void m2(boolean hangry){

        if(hangry){
            int w = 5;
            {
                System.out.println(w);
            }
        }


    }
}
