package Day9_IfStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        double a = 500;
        double b = 600;
        double c = 700;
        boolean aIsMax = a > b && a > c;
       // boolean aIsMax = a > b || a > c; here if any of them be true the out put is true...

        boolean bIsMax = b > a && b > c;
        // boolean bIsMax = aIsMax == false && b > c;

       // boolean cIsMax = c > a && c > b;
        boolean cIsMax = aIsMax == false && bIsMax == false;

        System.out.println(aIsMax);
        System.out.println(bIsMax);
        System.out.println(cIsMax);
        System.out.println("---------------------------------");

        double max = 0;

        if (aIsMax){
            // System.out.println(a);
            max = a;
        }
        if (bIsMax){
            // System.out.println(b);
            max = b;
        }
        if (cIsMax){
            // System.out.println(c);
            max = c;
        }
        System.out.println(a);

    }
}
