package Day7_UnaryShortHand;

public class LeapYear {
    public static void main(String[] args) {

        // Write a program that can identify if the giving is a leap year or not
        int year = 2020;
        boolean result = year % 4 == 0;

        System.out.println(year + " is a leap year: " + result);

    }
}
