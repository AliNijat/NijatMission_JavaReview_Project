package Day7_UnaryShortHand;

public class Unary {
    public static void main(String[] args) {


        System.out.println(  -1 + - 10 );
                         // 1- 1- ==> -11
        System.out.println( -1 - - 10);
                          // - 1 + 11 ==> 9

        int a = 20;
       // a = a - 1 = 19
            --a;
                // --a decreasment
        System.out.println(a);

        int b = 30;
        ++b; // b = b +1;
        System.out.println(b);

         // --a and ++a Pre-Inc and Dec
        int a1 = 25;
        System.out.println(++a1);
        System.out.println(--a1);

        System.out.println("==========");
        int b1 = 25;
        System.out.println(b1++);
        System.out.println(b1--);

    }
}
