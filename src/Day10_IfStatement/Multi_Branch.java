package Day10_IfStatement;

public class Multi_Branch {
    public static void main(String[] args) {
        int number = 0;

        if (number > 0){
            System.out.println(number + " is positive");
        }
        if (number < 0 ){
            System.out.println(number + " is negative");
        }
        if (number == 0 ){
            System.out.println(number + " is zero");
            System.out.println("------------------------------");
        }

        if (number > 0){
            System.out.println(number + " is positive");
        }else if (number < 0 ){
            System.out.println(number + " is negative");
        }else { // number == 0
            System.out.println(number + " is zero");
        }
    }
}
