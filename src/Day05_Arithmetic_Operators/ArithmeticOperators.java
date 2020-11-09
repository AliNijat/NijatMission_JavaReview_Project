package Day05_Arithmetic_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        // In execution the arithmetic operators are in this order: % >, * & />, + & -
        String count1 = 20 + 3 - 2 +1 + "\n" + 20 * 3;
        System.out.println( count1 );
        System.out.println("");
                       // 23 - 3 = 22 & 20 * 3 = 60

        String count2 = 10/3 + "\n" + 10/3.0 + "\n" + 10.0/3.0;
        double count3 = 10/3 + 10/3.0;
        System.out.println( count2 );
        System.out.println(count3);
        System.out.println("=====================");

        int count4 = 12 + 3 * 4 - 5 / 2;
        System.out.println( count4 );    // first the / and * most be executes
                                                     // 12 + 12 - 2 = > 24 - 2 = 22
        System.out.println(12 + 3 * 4 - 5 / 2);
        System.out.println("=====================");

        // for remainder in integer or floating numbers
        String count5 = 30%5 + "\n" + 99 % 4 + "\n"+ 30.%5 + "\n" + 100%10.0 +"\n" + 20.0%2.0;
        System.out.println( count5 );

        int count6 = 12 + 2 - ( 4 * 2 - 2 / 6 ) / 1 - 2 * 4 % 4;
        System.out.println( count6);
                          // 12 + 2 - ( 8 - 0) / 1 - 12 % 4
                          // 12 + 2 - 8 / 1 - 0
                          // 12 + 2 - 8 ==>> 6






    }
}
