package Day7_UnaryShortHand;

public class task1 {
    public static void main(String[] args) {

        int x = 2;                // 2
       double y = x++;            // 2
        System.out.println(x);    // 2
        System.out.println(x);
        System.out.println(y);
        System.out.println(x);
        System.out.println("---------");
        x = 2;                    // 2
        System.out.println(x++);  // 2
        System.out.println("----------");
        x = 2;                    // 2
        System.out.println(--x);  // 2
        System.out.println("----------");
        x = 8;                    // 8
        y = x--;                  // 8
        System.out.println(y);    // 8

        System.out.println("-------------------");

        int B = 50;
        B = --B + B++ + B-- + B++; System.out.println(B);
          // 49 + 49 + 49 + 50 ==> 199


    }
}
