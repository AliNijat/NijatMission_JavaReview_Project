package Day7_UnaryShortHand;

public class EvenNumbers {
    public static void main(String[] args) {

        boolean evenNumber  = 65 % 2 == 0;
        boolean evenNumber1 = 65 % 3 == 0;
        boolean evenNumber2 = 65 % 5 == 0;

        System.out.println("65 is divisible by 2: " + evenNumber +"\n" + "65 is divisible by 5: " + evenNumber2 );

    }
}
