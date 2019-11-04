package InitializerBlocks;

/**
 * @author Hamza Ouni
 */
public class Chick {

    long z = 2_147_483_647;
    long z1 = 2_147_483_648L;

    double x = 3.2;

    int e2;

    int num ;


    short a ;


    {
        name = "test" ;
       // System.out.println(name);
    } //  COMPILE
    private String name = "h";

    public static void main(String[] args) {

        String a564546492a;

        int _age;


        String privatE;

        int a6 = 0X17;
        System.out.println(a6);

//
//    Chick chick = new Chick();
//        System.out.println(chick.name);





}



    void m2() {

        int e1 = 5;

        int s = e1 + e2;

    }

    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // and initialized here
        int reply = x + y;
        return reply;
    }

    public void findAnswer(boolean check) {
        //check=false;
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
            onlyOneBranch = 2;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }



}
