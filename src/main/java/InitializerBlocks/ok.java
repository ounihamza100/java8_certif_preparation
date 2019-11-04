package InitializerBlocks;

/**
 * @author Hamza Ouni
 */
public class ok {

    int num,  value; // DOES NOT COMPILE
    String s3 = "yes", s4 = "no";
  //  int i1, i2, i3 = 0;
    long e = 1000000000;
    long r = 10000000000L;

    long max = 3123456789L;

    private String name = "Fluffy";
    { System.out.println(name); } // DOES NOT COMPILE



    { a = 5; } // why is this ok???
    int a = 10;

    public ok() {
        super();
        System.out.println("bla bla bla bla");
    }

    public static void main(String[] args) {
        ok why = new ok();
        System.out.println(why.a); // 10
        System.out.println(Integer.MAX_VALUE);
        int x = 017;
        int  b = 0b101;
        System.out.println(b);
    }


    static {
        System.out.println("tt");
    }

    boolean b1, b2;
    String s1 = "1", s2;
    double d1; double d2;

    int i1; int i2;

    int i3, i4;





























}
