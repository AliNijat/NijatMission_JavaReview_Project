package Day8_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {

        int number = 100;
        number = number + 7;

        boolean even = number%2 ==0;
        boolean odd = !even;

        if (even){
            System.out.println(number + " is even number");
        }
        if (odd){
            System.out.println(number + " is odd number");
        }


    }
}