package Day7_UnaryShortHand;

public class ShortHand {
    public static void main(String[] args) {

       int a = 20;
           a = a + 20; // a = 40
           a += 4;     // a = 44
        System.out.println(a);
        System.out.println("---------------");

        int b = 10;
            b = b - 5; // b = 5
            b -= 5;    // b = 0
        System.out.println(b);
        System.out.println("----------------");

        int c = 5;
            c = c * 2; // c = 10
            c *= 2;    // c = 20
        System.out.println(c);
        System.out.println("-----------------");

        String myName = "Mohammad Ali";   // the only concnate that can apply to string is  "+"
          //myName += " ALi Nijat";
            myName = "Mohammad ALi" + " Ali Nijat";
        System.out.println(myName);
        System.out.println("-----------------");

        int budget = 100000;
          //budget = budget/2;
            budget /= 2;
        System.out.println(budget);



    }
}
