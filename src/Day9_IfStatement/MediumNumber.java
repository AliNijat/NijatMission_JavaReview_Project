package Day9_IfStatement;

public class MediumNumber {
    public static void main(String[] args) {

        double a = 100;
        double b = 300;
        double c = 200;

        boolean aIsMed = (a > b && a < c) || (a > c && a < b);
        boolean bIsMed = (b > a && b < c) || (b < a && b > c);

        boolean cIsMed = aIsMed == false && bIsMed == false;
       // boolean cIsMed = !aIsMed && !bIsMed;
        System.out.println(aIsMed + "\t" + bIsMed + "\t" + cIsMed);
        System.out.println("------------------------------------");

        double med = 0;

        if (aIsMed){
           // System.out.println(a);
            med = a;
        }
        if (bIsMed){
           // System.out.println(b);
            med = b;
        }
        if (cIsMed){
           // System.out.println(c);
            med = c;
        }
        System.out.println(med);



    }
}
