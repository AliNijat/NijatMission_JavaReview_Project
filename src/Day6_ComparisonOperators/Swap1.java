package Day6_ComparisonOperators;

public class Swap1 {
    public static void main(String[] args) {

        int a = 25;
        int b = 30;

        int c = a;  // 10

        a = b ; // 10
        b = c ; // 10

         c = a; // c = 10
         a = c; // a = 10
         b = a; // b = 10


        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

    }

}
