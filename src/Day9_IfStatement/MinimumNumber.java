package Day9_IfStatement;

public class MinimumNumber {

    public static void main(String[] args) {

        double a = 100;
        double b = 300;
        double c = 200;

        boolean aIsMin = a < b && a < c;
        // boolean aIsMin = a < b || a < c; here if any of them be true the out-put is true...

        boolean bIsMin = aIsMin == !true && b < c;
        // boolean bIsMin = b < a && b < c;

        // boolean cIsMin = c < a && c < b;
        boolean cIsMin =  bIsMin == false && aIsMin == false;


        double min = 0;

        if (aIsMin){
            min = a;
        }
        if (bIsMin){
            min = b;
        }
        if (cIsMin){
            min = c;
        }
        System.out.println(min + " is the minimum number in this condition");
    }
}
