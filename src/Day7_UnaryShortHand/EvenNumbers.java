package Day7_UnaryShortHand;

public class EvenNumbers {
    public static void main(String[] args) {

        int number = 7089;
        boolean evenNumber  = number % 2 == 0;
        boolean evenNumber1 = number % 3 == 0;
        boolean evenNumber2 = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + evenNumber + "\n" +
                           number + " is divisible by 3 " + evenNumber1 + "\n" +
                           number + " is divisible by 5: " + evenNumber2 );

    }
}
