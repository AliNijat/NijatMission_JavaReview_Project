package Day9_IfStatement;

public class Breaks {
    public static void main(String[] args) {

        String itsBt = "yes";

        if (itsBt == "yes"){
            System.out.println("Take a 15 minutes beak!");
        }
        if (itsBt == "No")
            System.out.println("Continue the class!");


        int a = 100;
        int b = 200;


        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        if ( b > a )System.out.println( b + " is greater than " + a);
    }
}
