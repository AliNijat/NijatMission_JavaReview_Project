package Day8_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {

       int a = 20;
       int b = 30;

        if (a >= b ){
            System.out.println(a + " is the maximum number.");
       // }else {
        //    System.out.println(b + " is the maximum number");
        }

        if (b >= a){
            System.out.println(b + " is the maximum number");
        }

        if (b==a){}
            System.out.println(a + b );
            System.out.println("------------------------------");

        boolean breakTime = !true;
        if ( breakTime == !true){
                System.out.println("Take 15 minute break!");
            }else {
            System.out.println("Keep studying!");
        }


    }
}
